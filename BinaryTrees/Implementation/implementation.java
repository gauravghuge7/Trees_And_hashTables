package Implementation;


class Implementation {


    public static class Node {

        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }


    public static void display(Node root) {

        if(root == null) return;


        System.out.print(root.val+" =>  ");
        if(root.left != null) System.out.print(root.left.val+" ");
        if(root.right != null) System.out.print(root.right.val+" ");

        System.out.println();

        System.out.println();

        display(root.left);
        display(root.right);

    }


    public static int size(Node root) {

        if(root == null) return 0;

        return 1 + size(root.left) + size(root.right);

    }


    public static int sum(Node root) {

        if(root == null) return 0;

        return root.val + sum(root.left) + sum(root.right);

    }


    public static int max(Node root) {
        if(root == null) return Integer.MIN_VALUE;

        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }


    public static void main(String[] args) {
      
        Node root = new Node(2);

        // create a node and define in tree 
        Node a = new Node(5);
        root.left = a;

        Node b = new Node(8);
        root.right = b;


        Node c = new Node(12);
        a.left = c;

        Node d = new Node(25);
        a.right = d;


        Node e = new Node(1685);
        b.right = e;

        
        display(root);
        System.out.println(size(root));

        System.out.println(sum(root));


        System.out.println(max(root));


    }
}