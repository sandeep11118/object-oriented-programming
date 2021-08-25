// power of a given no
import java.util.*;
public class p16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE BASE");
        int n = sc.nextInt();
        System.out.println("ENTER A NO");
        int m = sc.nextInt();
        int result = 1;

        for(int i = n; i > 0; i--){
            result = result * m;
        }

        //result = (int)(Math.pow(m, n));

        System.out.println(result);
       
    }
    
}
