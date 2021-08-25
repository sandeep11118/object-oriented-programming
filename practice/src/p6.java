// to check whether a no is prime or not

import java.util.*;
public class p6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER A NO");
int n = sc.nextInt();
int count = 0;

for(int i = 2; i < n; i++ ){

    if(n % i == 0){
        count ++;
    }
}

if(count >= 1){
    System.out.println("IT IS NOT A PRIME NO");
}
else if(count == 0){
    System.out.println("IT IS A PRIME NO");
}


        
    }
    
}
