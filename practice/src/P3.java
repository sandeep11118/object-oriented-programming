//SUM OF FIRST N NATURAL NO

import java.util.*;
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NO");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;

        }

        System.out.println(sum);

    }
    
}