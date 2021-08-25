import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER A NO");
        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("EVEN NO");
        }
        else if(x % 2 != 0){
            System.out.println("ODD NO");
        }
        else {
            System.out.println("WRONG INPUT");
        }
        
            
        
    }
    
}
