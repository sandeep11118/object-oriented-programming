// PERFECT NO

import java.util.*;
public class p20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER A NO");
        int n = sc.nextInt();
        int a = n;
        int sum = 0;

        for(int i = 1; i < a; i++ ){
            if( a % i == 0 ){

                sum = sum + i;

            }
        }

        if(n == sum){
            System.out.println("IT IS A PERFECT NO");
        }
        else{
            System.out.println("IT IS NOT A PERFECT NO");
        }
    }
    
}
