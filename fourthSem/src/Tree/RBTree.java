package Tree;



public class RBTree {
    ReadBlackTree root;
    private final boolean RED = false;
    private final boolean BLACK = true;

    public ReadBlackTree query(int key) {
        ReadBlackTree tmp = root;
        while (tmp != null) {
            if (tmp.getKey() == key)
                return tmp;
            else if (tmp.getKey() > key)
                tmp = tmp.getLeft();
            else
                tmp = tmp.getRight();
        }
        return null;
    }

    public void insert(int key) {
        ReadBlackTree node = new ReadBlackTree(key);
        if (root == null) {
            root = node;
            node.setColor(BLACK);
            return;
        }
        ReadBlackTree parent = root;
        ReadBlackTree son = null;
        if (key <= parent.getKey()) {
            son = parent.getLeft();
        } else {
            son = parent.getRight();
        }
        //find the position
        while (son != null) {
            parent = son;
            if (key <= parent.getKey()) {
                son = parent.getLeft();
            } else {
                son = parent.getRight();
            }
        }
        if (key <= parent.getKey()) {
            parent.setLeft(node);
        } else {
            parent.setRight(node);
        }
        node.setParent(parent);

        //fix up
        insertFix(node);
    }

    private void insertFix(ReadBlackTree node) {
        ReadBlackTree father, grandFather;
        while ((father = node.getParent()) != null && father.getColor() == RED) {
            grandFather = father.getParent();
            if (grandFather.getLeft() == father) {  // F - ситуация с левым сыном G, как и в предыдущем анализе
                ReadBlackTree uncle = grandFather.getRight();
                if (uncle != null && uncle.getColor() == RED) {
                    setBlack(father);
                    setBlack(uncle);
                    setRed(grandFather);
                    node = grandFather;
                    continue;
                }
                if (node == father.getRight()) {
                    leftRotate(father);
                    ReadBlackTree tmp = node;
                    node = father;
                    father = tmp;
                }
                setBlack(father);
                setRed(grandFather);
                rightRotate(grandFather);
            } else {                               // F - случай правого сына G, симметричная операция
                ReadBlackTree uncle = grandFather.getLeft();
                if (uncle != null && uncle.getColor() == RED) {
                    setBlack(father);
                    setBlack(uncle);
                    setRed(grandFather);
                    node = grandFather;
                    continue;
                }
                if (node == father.getLeft()) {
                    rightRotate(father);
                    ReadBlackTree tmp = node;
                    node = father;
                    father = tmp;
                }
                setBlack(father);
                setRed(grandFather);
                leftRotate(grandFather);
            }
        }
        setBlack(root);
    }

    public void delete(int key) {
        delete(query(key));
    }

    private void delete(ReadBlackTree node) {
        if (node == null)
            return;
        if (node.getLeft() != null && node.getRight() != null) {
            ReadBlackTree replaceNode = node;
            ReadBlackTree tmp = node.getRight();
            while (tmp != null) {
                replaceNode = tmp;
                tmp = tmp.getLeft();
            }
            int t = replaceNode.getKey();
            replaceNode.setKey(node.getKey());
            node.setKey(t);
            delete(replaceNode);
            return;
        }
        ReadBlackTree replaceNode = null;
        if (node.getLeft() != null)
            replaceNode = node.getLeft();
        else
            replaceNode = node.getRight();

        ReadBlackTree parent = node.getParent();
        if (parent == null) {
            root = replaceNode;
            if (replaceNode != null)
                replaceNode.setParent(null);
        } else {
            if (replaceNode != null)
                replaceNode.setParent(parent);
            if (parent.getLeft() == node)
                parent.setLeft(replaceNode);
            else {
                parent.setRight(replaceNode);
            }
        }
        if (node.getColor() == BLACK)
            removeFix(parent, replaceNode);

    }

    // Дополнительный цвет находится в узле
    private void removeFix(ReadBlackTree father, ReadBlackTree node) {
        while ((node == null || node.getColor() == BLACK) && node != root) {
            if (father.getLeft() == node) {  // S - левый сын P, как и в предыдущем анализе
                ReadBlackTree brother = father.getRight();
                if (brother != null && brother.getColor() == RED) {
                    setRed(father);
                    setBlack(brother);
                    leftRotate(father);
                    brother = father.getRight();
                }
                if (brother == null || (isBlack(brother.getLeft()) && isBlack(brother.getRight()))) {
                    setRed(brother);
                    node = father;
                    father = node.getParent();
                    continue;
                }
                if (isRed(brother.getLeft())) {
                    setBlack(brother.getLeft());
                    setRed(brother);
                    rightRotate(brother);
                    brother = brother.getParent();
                }

                brother.setColor(father.getColor());
                setBlack(father);
                setBlack(brother.getRight());
                leftRotate(father);
                node = root;// вне цикла
            } else {                         // S - случай правого сына P, симметричная операция
                ReadBlackTree brother = father.getLeft();
                if (brother != null && brother.getColor() == RED) {
                    setRed(father);
                    setBlack(brother);
                    rightRotate(father);
                    brother = father.getLeft();
                }
                if (brother == null || (isBlack(brother.getLeft()) && isBlack(brother.getRight()))) {
                    setRed(brother);
                    node = father;
                    father = node.getParent();
                    continue;
                }
                if (isRed(brother.getRight())) {
                    setBlack(brother.getRight());
                    setRed(brother);
                    leftRotate(brother);
                    brother = brother.getParent();
                }

                brother.setColor(father.getColor());
                setBlack(father);
                setBlack(brother.getLeft());
                rightRotate(father);
                node = root;// вне цикла
            }
        }

        if (node != null)
            node.setColor(BLACK);
    }

    private boolean isBlack(ReadBlackTree node) {
        if (node == null)
            return true;
        return node.getColor() == BLACK;
    }

    private boolean isRed(ReadBlackTree node) {
        if (node == null)
            return false;
        return node.getColor() == RED;
    }

    private void leftRotate(ReadBlackTree node) {
        ReadBlackTree right = node.getRight();
        ReadBlackTree parent = node.getParent();
        if (parent == null) {
            root = right;
            right.setParent(null);
        } else {
            if (parent.getLeft() != null && parent.getLeft() == node) {
                parent.setLeft(right);
            } else {
                parent.setRight(right);
            }
            right.setParent(parent);
        }
        node.setParent(right);
        node.setRight(right.getLeft());
        if (right.getLeft() != null) {
            right.getLeft().setParent(node);
        }
        right.setLeft(node);
    }

    private void rightRotate(ReadBlackTree node) {
        ReadBlackTree left = node.getLeft();
        ReadBlackTree parent = node.getParent();
        if (parent == null) {
            root = left;
            left.setParent(null);
        } else {
            if (parent.getLeft() != null && parent.getLeft() == node) {
                parent.setLeft(left);
            } else {
                parent.setRight(left);
            }
            left.setParent(parent);
        }
        node.setParent(left);
        node.setLeft(left.getRight());
        if (left.getRight() != null) {
            left.getRight().setParent(node);
        }
        left.setRight(node);
    }

    private void setBlack(ReadBlackTree node) {
        node.setColor(BLACK);
    }

    private void setRed(ReadBlackTree node) {
        node.setColor(RED);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(ReadBlackTree node) {
        if (node == null)
            return;
        inOrder(node.getLeft());
        System.out.println(node);
        inOrder(node.getRight());
    }
}
