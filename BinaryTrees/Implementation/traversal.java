package Implementation;


class traversal {

    public static class Node {

        int val;
        Node left;
        Node right;

        Node(int val) {

            this.val = val;

        }


    }
    
    static void preOrder(Node root) {

        if(root == null) return;

        System.out.println(root.val);

        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        
        Node root = new Node(3);

        // root left side 
        Node a = new Node(4);
        root.left = a;

        // root  right side 
        Node b = new Node(5);
        root.right = b;


        // a left and right side 
        
        Node c = new Node(8);
        a.left = c;
        Node d = new Node(12);
        a.right = d;
        
        /// b left and right side 
        
        Node e = new Node(35);
        b.left = e;
        Node f = new Node(48);
        b.right = f;


        /// e left and right side
        Node g = new Node(6);
        e.left = g;
        Node h = new Node(67);
        e.right = h;

        preOrder(root);

        
    }

}
