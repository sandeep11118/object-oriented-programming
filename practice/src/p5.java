// to check whether a year is leap year or not

import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the year");
        int n = sc.nextInt();

        if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
    
}
