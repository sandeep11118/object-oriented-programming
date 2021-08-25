import java.util.*;
public class p18 {
int result = 0 ;
    public  int evenOdd(int a){
        if(a % 2 == 0){
            return 1;
        }
        else{
            return 2;
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        p18 s  = new p18(); 
        System.out.println("enter a no");
        int n = sc.nextInt();
        int result = s.evenOdd(n);
         

        if( result == 1){
          System.out.println("EVEN NO");
        }
        else if (result == 2){
               System.out.println("ODD NO");
        }

    }
    
}
