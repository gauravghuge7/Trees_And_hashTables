package BinaryTrees.diameter_and_levelOrder;
import BinaryTrees.TreeNode.TreeNode;


class bruteDiameter {

    /**
     *  check the diameter of tree in O(n^2);
     *
     * @param root
     * @return
     */
    private int diameter(TreeNode root) {

        if(root == null) return 0;

        int left = diameter(root.left);
        int right = diameter(root.right);

        int mid = left + right;

        if(root.left != null) mid++;
        if(root.right != null) mid++;

        return Math.max(mid, Math.max(left, right));
    }

    private int height(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

}

class optimizedDiameter {

}


public class Diameter_of_Tree {

    private static int bruteForce_Diameter(TreeNode root) {

    }

    public static void main(String[] args) {

    }
}
