

import java.util.LinkedList;
import java.util.Queue;

public class level_Order {


    public static class TreeNode {

        public TreeNode left;
        public TreeNode right;
        public int val;
        public TreeNode(int val) {
            this.val = val;
        }
    }



    private static TreeNode construct(String[] arr) {

        /**
         *  Base Case: Empty Node
         */

        if(arr.length == 0 || arr[0] == "") return null;

        int x = Integer.parseInt(arr[0]);
        int n = arr.length;

        TreeNode root = new TreeNode(x);

        Queue<TreeNode> q = new LinkedList<>();

        int i = 1;

        while(i < n-1) {

            TreeNode temp = q.poll();

            TreeNode left = new TreeNode(0);
            TreeNode right = new TreeNode(0);

            if(arr[i].equals("")) {
                left = null;
            }
            else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }

            if(arr[i+1].equals("")) {
                right = null;
            }
            else {
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }


            temp.left = left;
            temp.right = right;
            i+=2;
        }

        return root;
    }


    public static void main(String[] args) {



    }
}
