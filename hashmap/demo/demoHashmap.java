import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class demoHashmap {



    public static void demoMap() {

        Map<String, Integer> age = new HashMap<>();

        age.put("gaurav", 20);
        age.put("vaibhav", 23);
        age.put("nilesh", 19);
        age.put("kartik", 24);
        age.put("nikhil", 26);


        System.out.println(age.get("vaibha"));   /// print the null

        System.out.println(age.get("vaibhaV")); //// printing null because the V is capital

        System.out.println(age.get("vaibhav"));
        
        System.out.println(" => "+age.containsKey("vaibhav"));   // boolean return type


        System.out.println(age.keySet());    /// print all keys

        System.out.println(age.values());   /// print all values in the set


        System.out.println(age.entrySet());   /// print all key and values  []  this type of brackets
 
        System.out.println(age);   /// print all the key values {} this type of brackets




        for (String key : age.keySet()) {
            
            System.out.printf("the age of %s is %d \n", key, age.get(key));
        }

    }
 



    public static void main(String[] args) {
        
       
        Map <String, String> map = new HashMap<>();
        
        map.put("gaurav", "swe");

        
        demoMap();

        
        
        
    }
}
