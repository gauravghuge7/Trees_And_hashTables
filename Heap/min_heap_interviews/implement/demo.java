


class Node {
   int val;
   Node left;
   Node right;

   public Node(int val) {
      this.val = val;
   }
}

class heap {

   public Node root;   //* minimum number in the heap  */

   public heap() {}


   public void insert(int val) {

      Node temp = new Node(val); //* create a node of number */

      if(root == null) {
         root = temp;
         return;
      }

   }


   public void printHeap(Node temp) {
      if(temp == null) return;
      System.out.print(temp.val+" ");
      printHeap(temp.left);
      printHeap(temp.right);
   }

}



class demo {

   public static void main(String[] args) {
      
      
      heap heap = new heap();

      heap.insert(5);

      heap.insert(7);

      heap.printHeap(heap.root);

   }
}