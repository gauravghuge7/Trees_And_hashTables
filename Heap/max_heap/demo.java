package Heap.max_heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class demo {

   public static void swap(List<Integer> list, int i, int j) {

      int temp = list.get(i);
      list.add(i, list.get(j));
      list.add(j, temp);

   }

   
   public void sortHeap(List<Integer> list) {

      
      

   }
   
   public static void main(String[] args) {
      
      List<Integer> list = new ArrayList<>();

      list.add(2);
      list.add(5);
      list.add(4);
      list.add(9);
      list.add(1);


      PriorityQueue<Integer> pq = new PriorityQueue<>();

      pq.add(89);
      pq.add(15);
      pq.add(8);
      pq.add(19);

      

      
      System.out.println(pq.poll());


   }
}
