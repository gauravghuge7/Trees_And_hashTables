class ratInRace {


    static int maze (int sr, int sc, int er, int ec) {

        if(sr>er || sc > ec)  return 0;

        if(sr == er || sc == ec) return 1;
        
        int downways = maze(sr+1, sc, er, ec);
        int rightways = maze(sr, sc+1, er, ec);


        return downways + rightways;
    }



    static void printMaze(int sr, int sc, int er, int ec,   String s) {
        
        if(sr > er || sc > ec) return;

        if(sr == er && sc == ec) {
 
            System.out.println(s);
            return;
        };




        /// right ways 
        printMaze(sr, sc+1, er, ec, s+"R");

        /// down ways
        printMaze(sr+1, sc, er, ec, s+"D");

    

    }


    public static void main(String args[]) {

        int rows = 3;
        int cols = 2;


        // int count = maze(1, 1, cols, rows);

        // System.out.println(count);

        printMaze(1,1, rows, cols, "");
        
    }
}