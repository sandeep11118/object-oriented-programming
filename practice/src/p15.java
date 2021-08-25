// factorial of a given no

import java.util.*;
public class p15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NO TO FIND THE FACTORIAL");
        int n = sc.nextInt();
        int factorial = 1;

        for(int i = 1; i <= n; i++ ){
            factorial *= i;

        }

        System.out.println(factorial);
    }
    
}
