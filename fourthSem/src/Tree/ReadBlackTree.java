package Tree;


import java.util.Objects;

public class RBTree {
    private final boolean RED = false;
    private final boolean BLACK = true;
    private int key;
    private boolean color;
    private RBTree left;
    private RBTree right;
    private RBTree parent;

    public RBTree(int key) {
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

    public RBTree getLeft() {
        return left;
    }

    public void setLeft(RBTree left) {
        this.left = left;
    }

    public RBTree getRight() {
        return right;
    }

    public void setRight(RBTree right) {
        this.right = right;
    }

    public RBTree getParent() {
        return parent;
    }

    public void setParent(RBTree parent) {
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