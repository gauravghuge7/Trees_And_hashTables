package Heap.min_heap_interviews.correct_code;



import java.util.LinkedList;
import java.util.Queue;

class Node {
   int val;
   Node left;
   Node right;

   public Node(int val) {
      this.val = val;
   }
}





class MinHeap {
   public Node root;

   public MinHeap() {}

   public void insert(int val) {
       Node newNode = new Node(val);
       if (root == null) {
           root = newNode;
           return;
       }

       Queue<Node> queue = new LinkedList<>();
       queue.add(root);
       while (!queue.isEmpty()) {
           Node temp = queue.poll();

           if (temp.left == null) {
               temp.left = newNode;
               break;
           } else {
               queue.add(temp.left);
           }

           if (temp.right == null) {
               temp.right = newNode;
               break;
           } else {
               queue.add(temp.right);
           }
       }
       heapifyUp(newNode);
   }

   private void heapifyUp(Node node) {
       if (node == null || node == root) return;
       Node parent = findParent(root, node);

       if (parent != null && parent.val > node.val) {
           int temp = parent.val;
           parent.val = node.val;
           node.val = temp;
           heapifyUp(parent);
       }
   }

   public void delete(int val) {
       if (root == null) return;

       Queue<Node> queue = new LinkedList<>();
       queue.add(root);
       Node targetNode = null;
       Node lastNode = null;

       while (!queue.isEmpty()) {
           lastNode = queue.poll();
           if (lastNode.val == val) {
               targetNode = lastNode;
           }
           if (lastNode.left != null) queue.add(lastNode.left);
           if (lastNode.right != null) queue.add(lastNode.right);
       }

       if (targetNode != null) {
           targetNode.val = lastNode.val;
           deleteLastNode();
           heapifyDown(root);
       }
   }

   private void deleteLastNode() {
       Queue<Node> queue = new LinkedList<>();
       queue.add(root);
       Node parent = null;
       Node current = root;

       while (!queue.isEmpty()) {
           parent = current;
           current = queue.poll();
           if (current.left != null) queue.add(current.left);
           if (current.right != null) queue.add(current.right);
       }

       if (parent != null) {
           if (parent.left != null && parent.left == current) {
               parent.left = null;
           } else if (parent.right != null && parent.right == current) {
               parent.right = null;
           }
       }
   }

   private void heapifyDown(Node node) {
       if (node == null) return;

       Node smallest = node;
       if (node.left != null && node.left.val < smallest.val) {
           smallest = node.left;
       }
       if (node.right != null && node.right.val < smallest.val) {
           smallest = node.right;
       }

       if (smallest != node) {
           int temp = node.val;
           node.val = smallest.val;
           smallest.val = temp;
           heapifyDown(smallest);
       }
   }

   private Node findParent(Node root, Node child) {
       if (root == null || root == child) return null;

       Queue<Node> queue = new LinkedList<>();
       queue.add(root);

       while (!queue.isEmpty()) {
           Node temp = queue.poll();
           if (temp.left == child || temp.right == child) {
               return temp;
           }
           if (temp.left != null) queue.add(temp.left);
           if (temp.right != null) queue.add(temp.right);
       }
       return null;
   }

   public void printHeap(Node temp) {
       if (temp == null) return;
       System.out.print(temp.val + " ");
       printHeap(temp.left);
       printHeap(temp.right);
   }
}
