// ABUNDANT NO OR NOT


import java.util.*;
public class p222 {
    public static void main(String[] args) {
              Scanner sc = new Scanner (System.in);
        System.out.println("ENTER A NO");
        int n = sc.nextInt();
        int no = n;
         int sum = 0;

     for(int i = 1; i < no; i++){
         if (no % i == 0) {
             sum = sum + i;
         }
     }
      if (sum > n) {
          System.out.println("IT IS A ABUNDANT NO");
      }
      else{
          System.out.println("IT IS NOT A ABUNDANT NO");
      }
    }
    
}
