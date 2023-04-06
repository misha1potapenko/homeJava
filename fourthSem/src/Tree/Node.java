package Tree;


    // Java program to implement insert operation
// in Red Black Tree.

public class Node
    {
        Node left, right;
        int data;

        // red ==> true, black ==> false
        boolean color;

        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;

            // New Node which is created is
            // always red in color.
            color = true;
        }
    }


// This code is contributed by ARSHPREET_SINGH


