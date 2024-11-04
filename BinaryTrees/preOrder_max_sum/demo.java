package preOrder_max_sum;

import Node.Node;

public class demo {
   

   public static int size(Node root) {

      if(root == null) return 0;

      return 1 + size(root.left) + size(root.right);
      
   }

   public static int maxN(Node root) {
      if(root == null) return Integer.MIN_VALUE;

      return Math.max(root.val, Math.max(maxN(root.left), maxN(root.right)));
   }

   public static int sum(Node root) {
      if(root == null) return 0;

      return root.val + sum(root.left) + sum(root.right);
   }

   public static int height(Node root) {
      if(root == null) return 0;

      return 1 + Math.max(height(root.left), height(root.right));
   }   




   public static void main(String[] args) {


      Node root = new Node(-15);

      Node a = new Node(-14);
      Node b = new Node(-23);

      root.left = a;
      root.right = b;

      Node c = new Node(-25);
      a.left = c;
      Node d = new Node(-78);
      a.right = d;

      Node e = new Node(-10);
      b.left = e;
      // Node f = new Node(90);
      // b.right =f;

      System.out.println(size(root));
      System.out.println(maxN(root));
      System.out.println(sum(root));
      
      System.out.println(height(root));

   }
}
