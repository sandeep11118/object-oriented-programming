// sum of digits of the no

import java.util.*;
public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NO");
        int n = sc.nextInt();
        int sum = 0;

        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
            
        }

        System.out.println(sum);

    }
    
}
