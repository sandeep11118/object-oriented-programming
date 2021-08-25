// armstrong in a given range

import java.util.*;
public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the starting range");
        int starting = sc.nextInt();
        System.out.println("enter the ending range");
        int ending = sc.nextInt();
        

        for(int i = starting; i <= ending; i++){

            
            int z =  i;
            int m = i;
            int digit = 0;
            int sum = 0;

            while (m != 0) {
                int b = m % 10;
               digit = digit + 1;
                m /= 10;

            }

            while (z != 0) {
                int a = z % 10;
                sum += (Math.pow(a,digit));
                z /= 10;

            }

            if (sum == i) {
                System.out.println("IT IS A ARMSTRONG NO"+i+" = "+sum);
            }
            else{
                System.out.println("IT IS NOT A ARMSTRONG NO"+i+" = "+sum);
            }
        }


    }
    
}
