package Tree;


public class ReadBlackTree {
    private final boolean RED = false;
    private final boolean BLACK = true;
    private int key;
    private boolean color;
    private ReadBlackTree left;
    private ReadBlackTree right;
    private ReadBlackTree parent;

    public ReadBlackTree(int key) {
        this.key = key;
        this.color = RED;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public boolean getColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public ReadBlackTree getLeft() {
        return left;
    }

    public void setLeft(ReadBlackTree left) {
        this.left = left;
    }

    public ReadBlackTree getRight() {
        return right;
    }

    public void setRight(ReadBlackTree right) {
        this.right = right;
    }

    public ReadBlackTree getParent() {
        return parent;
    }

    public void setParent(ReadBlackTree parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "RBTreeNode{" +
                ",key=" + key +
                ", color=" + color +
                '}';
    }
}