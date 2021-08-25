// HARSHAD NO 

import java.util.*;
public class p21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER A NO");
        int n = sc.nextInt();
        int no = n;
        int sum = 0;

        while (no != 0) {
            int rem = n % 10;
             sum = sum + rem;
             no = no / 10;
        }
        if (sum % n == 0) {
            System.out.println("IT IS A HARSHAD NO");
        }
        else{
            System.out.println("IT IS NOT A HARSHAD NO");
        }
    }
    
}
