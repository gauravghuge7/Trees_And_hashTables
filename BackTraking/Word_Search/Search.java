package BackTraking.Word_Search;

public class Search {

    public boolean exist(char[][] board, String word) {

        char ch = word.charAt(0);
        int m = board.length;
        int n = board[0].length;


        boolean[][] vis = new boolean[m][n];


        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {

                if(check(board, vis, i, j, word)) return true;
            }
        }

        return false;

    }


    private boolean check(char[][] board, boolean[][] vis, int row, int col, String s) {

        if(s.isEmpty()) return  true;

        if(row >= board.length) return false;
        if(col >= board[0].length) return false;
        if(row < 0) return false;
        if(col < 0) return false;

        if(vis[row][col]) return false;
        if(s.charAt(0) != board[row][col]) return false;

        vis[row][col] = true;

        boolean right = check(board, vis, row + 1, col, s.substring(1));
        boolean left = check(board, vis, row - 1, col, s.substring(1));
        boolean top = check(board, vis, row , col + 1, s.substring(1));
        boolean bottom = check(board, vis, row , col - 1, s.substring(1));

        vis[row][col] = false;    // backtrack here

        return right || left || top || bottom;
    }


    public static void main(String[] args) {

    }

}
