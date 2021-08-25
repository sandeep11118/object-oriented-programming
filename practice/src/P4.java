// sum of no in a given range
import java.util.*;
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter the starting range");
int n = sc.nextInt();
System.out.println("enter the ending range");
int b = sc.nextInt();
int sum = 0;

for(int i = n; i <= b; i++){
sum += i;
}

System.out.println(sum);

    }
    
}
