package BackTraking.sudoku_solver;


import java.util.*;

public class solver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char ch = scan.nextLine().charAt(0);

        int n = scan.nextInt();

        int temp = ch + n;

        System.out.println((char) temp);
    }
}
