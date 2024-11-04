

public class index {
   public boolean isBalanced(String num) {

      int evenSum = 0;
   
      for(int i=0; i<num.length(); i+=2) {
   
         int sum = (int) num.charAt(i) ;
   
         evenSum += sum;
         
      }
         System.out.println(evenSum);
         int oddSum = 0;
   
      for(int i=1; i<num.length(); i+=2) {
         int sum = (int) num.charAt(i);
   
         oddSum += sum;
      }
      System.out.println(oddSum);
      return evenSum == oddSum;
   }
   

   public static void main(String[] args) {
 
      Character ch = '5';

      System.out.println(ch.charValue());
      
   }
}