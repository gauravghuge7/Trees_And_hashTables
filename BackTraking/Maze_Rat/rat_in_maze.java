package BackTraking.Maze_Rat;


import java.util.ArrayList;

public class rat_in_maze {


    // Function to find all possible paths
    public static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        // code here

        ArrayList<String> ans = new ArrayList<>();

        int n = mat.size();

        boolean[][] vis = new boolean[n][n];

        backtrack(n, ans, 0, 0, "", mat, vis);


        return  ans;
    }

    private static void backtrack(int n, ArrayList<String> ans, int row, int col, String curr, ArrayList<ArrayList<Integer>> mat, boolean[][] vis) {

        if(row < 0 || n <= row) return;
        if(col < 0 || n <= col) return;

        if(mat.get(row).get(col) == 0) return;
        if(vis[row][col]) return;

        if(row == n - 1 && col == n -1) {
            ans.add(curr);
        }

        vis[row][col] = true;

        backtrack(n, ans, row + 1, col, curr + "D", mat, vis);

        backtrack(n, ans, row , col + 1, curr+"R", mat, vis);

        backtrack(n, ans, row - 1, col, curr+"U", mat, vis);

        backtrack(n, ans, row, col-1, curr+"L", mat, vis);

        vis[row][col] = true;
    }

    private static boolean isValidCell(int n,  int row, int col, ArrayList<ArrayList<Integer>> mat) {

        /**
         *  Checking the index out of  bound here
         */
        if(col >= n || row >= n) return false;
        if(col < 0 || row < 0) return  false;

        /**
         * Check is Valid cell or not
         */
//        if(mat.get(row).get(col) == 0) return false;

        return  true;
    }

    public static void main(String[] args) {
        // Initializing the maze as a 2D ArrayList
        ArrayList<ArrayList<Integer>> maze = new ArrayList<>();

        // Creating the maze (0 for open path, 1 for obstacle)
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1); // Open path
        row1.add(0); // Obstacle
        row1.add(1); // Open path
        row1.add(1); // Open path
        maze.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(1); // Open path
        row2.add(0); // Obstacle
        row2.add(0); // Obstacle
        row2.add(1); // Open path
        maze.add(row2);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(1); // Open path
        row3.add(1); // Open path
        row3.add(1); // Open path
        row3.add(0); // Obstacle
        maze.add(row3);

        ArrayList<Integer> row4 = new ArrayList<>();
        row4.add(0); // Obstacle
        row4.add(0); // Obstacle
        row4.add(1); // Open path
        row4.add(1); // Open path
        maze.add(row4);



        ArrayList<String> ans = findPath(maze);

        System.out.println(ans);

        // Printing the maze
//        System.out.println("Maze Layout:");
//        for (ArrayList<Integer> row : maze) {
//            for (int cell : row) {
//                System.out.print(cell + " ");
//            }
//            System.out.println();
//        }
    }
}
