package problemsWithArray;

import java.util.Arrays;
import java.util.HashMap;
// import java.util.Hashtable;

public class demoHashMap {
    




    public static int checkFrequency(int[] arr) {

        Arrays.sort(arr);

        HashMap<Integer, Integer> fre = new HashMap<>(); 

        for(var i: arr) {

            if(!fre.containsKey(i)) {
                fre.put(i, 1);
            }

            else {
                fre.put(i,fre.get(i) +1);
            }
        }

        System.out.println(fre.entrySet());

        int maxFreq = 0, ansKey = -1;

        for(var e : fre.entrySet()) {
            if(e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        
        return ansKey;

    }






    public static void main(String[] args) {
      
        int[] arr = {1,2,1,1,1,2,3,4,4,4,4,4,5,6};

        System.out.println(checkFrequency(arr));

        // Hashtable<Integer, Integer> mp = new Hashtable<>();
    }

}
