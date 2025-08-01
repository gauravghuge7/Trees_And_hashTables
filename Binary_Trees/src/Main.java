import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static class implement {

       class Node<T> {

          int root;

          List<Node<T>> children;

          public Node(int val) {

             this.root = val;
             this.children = new ArrayList<>();
          }
       }

    }
}