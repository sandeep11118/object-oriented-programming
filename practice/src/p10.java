// palindrome no

import java.util.*;
public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER A NO");
        int a = sc.nextInt();
        int rev = 0;

        while (a != 0) {
            int rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }

        System.out.println(rev);
    }
    
}
