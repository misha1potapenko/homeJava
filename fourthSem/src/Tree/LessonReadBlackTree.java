package Tree;

import java.awt.*;

public class LessonReadBlackTree {
    private Node root;

    public boolean add(int value) {}

    private boolean addNode(Node node, int value){
        if (node.value == value){
            return false;
        }
    }

    private Node rebalance(Node node) {}

    private Node rightSwap(Node node){}

    private Node leftSwap(Node node){}







    private class Node {
        private int value;
        private Color color;
        private Node leftChild;
        private Node rightChild;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", color=" + color +
                    ", leftChild=" + leftChild +
                    ", rightChild=" + rightChild +
                    '}';
        }
    }
    private enum Color{
        RED, BLACK
    }
}
