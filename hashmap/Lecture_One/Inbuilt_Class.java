package hashmap.Lecture_One;

import java.util.HashMap;
import java.util.Map;

public class Inbuilt_Class {


    public void intro() {

        /**
         * Syntax of the HashMap class
         */

        Map<String, Integer> map = new HashMap<>();

        /**
         *  Adding Elements
         */

        map.put("gaurav", 35);
        map.put("akash", 10);
        map.put("dipak", 8);

        /**
         *  Remove Element from Map
         */

//        map.remove("gaurav");
//        map.remove("dipak");

//        System.out.println(map);


        /**
         *  Print the keySet
         */

//        System.out.println(map.keySet());

//        System.out.println(map.values());

//        System.out.println(map.entrySet());

//        for(var s : map.keySet()) {
//            System.out.printf("%s is key value is %d \n", s, map.get(s));
//        }


        /**
         *  Check the Other Methods of HashMaps
         */

//        System.out.println(map.containsValue(37));

        /**
         *   this method put the value inside the map and also return the value of the key
         *
         *   return the value of key
         */
//        System.out.println(map.getOrDefault("gaurav", 47));



    }





    public static void main(String[] args) {


        Inbuilt_Class a = new Inbuilt_Class();

        a.intro();


    }
}
