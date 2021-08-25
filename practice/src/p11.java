// armstrong  no

import java.util.*;
public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER A NO");
        int n = sc.nextInt();
        int armstrong = 0;
        int digits = 0;
        int z = n;
        int j = n;

        while (n != 0) {
            int rem = n % 10;
            digits++;
             n = n / 10;
        }

        while (z != 0) {

            int a = z % 10;
            armstrong += (Math.pow(a,digits)); 
            z = z /10;

        }

        System.out.println(armstrong);
        
        if(j == armstrong){
            System.out.println("IT IS A ARMSTRONG NO");
        }
        else{
            System.out.println("IT IS NOT A ARMSTRONG NO");
        }
    }
}
