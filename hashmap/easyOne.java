package hashmap;

import java.util.Scanner;

public class easyOne {


    public static int solveProblem(int n) {
        return n - 1; // Directly calculate the result
    }

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        /**
         *   Here is test cases
         * */
        int t = scan.nextInt();

        for(int i=0; i<t; i++) {

            int n = scan.nextInt();

            System.out.println(solveProblem(n));
        }


        scan.close();
    }
}
