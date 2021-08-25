// STRONG NO OR NOT USING JAVA

import java.util.*;
public class p19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NO");
         int n = sc.nextInt();
         int check = n;
         
         int temp = 0;

         while (check != 0) {
            int s = 1;
            int rem = check % 10;
            
            for(int i = 1; i <= rem; i++){

                s = s * i;

            }

            temp = temp + s;
            check = check / 10; 
         }

         if(temp == n){
             System.out.println("IT IS A STRONG NO");
         }
         else{
             System.out.println("IT IS NOT A STRONG NO");
         }
         System.out.println(temp
         );
    }
    
}
