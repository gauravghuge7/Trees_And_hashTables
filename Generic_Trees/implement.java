package Generic_Trees;

import java.util.ArrayList;
import java.util.List;

public class implement {
   
   class Node<T> {

      int root;

      List<Node<T>> children;

      public Node(int val) {

         this.root = val;

         this.children = new ArrayList<>();
      }
   }

}
