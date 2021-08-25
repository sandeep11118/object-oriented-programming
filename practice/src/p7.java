// to check a prime no in a given range 

import java.util.*;
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER A STARTING POINT");
        int a = sc.nextInt();
        System.out.println("ENTER A ENDING POINT");
        int b = sc.nextInt();
       

        for(int i = a; i < b; i++){
            int count = 0;

            for(int j = 2; j < i; j++ ){
                if(i % j == 0){
                    count ++;
                } 
            }

            if(count >= 1){
                System.out.println("IT IS NOT A PRIME NO "+i);
            }

            else if(count == 0){
                System.out.println("IT IS A PRIME NO "+i);
            }  

        }
        
    }
    
}
