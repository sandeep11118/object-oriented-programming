// FIBONACCI SERIES

import java.util.*;
public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER THE NO ");
        int n = sc.nextInt();

        if (n > 0) {

            int a = 0;
            int b = 1;
            int c = 0;

            while (b <= n) {
                c = a + b;
                a = b ;
                b = c;
            }
            
            if (b <= n) {

                System.out.println(c);
    
            }
            

            
        }
    }
    
}
