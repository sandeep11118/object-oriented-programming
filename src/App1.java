import java.util.*;
public class App1 {

    int id ;
    String name;

    App1(int a , String c){

        id = a;
        name = c;
    }

    App1(App1 s){  
        id = s.id;  
        name =s.name;  
        }  

    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {

        App1 s2 = new App1(111,"sandeep");
        App1 s1 = new App1(s2);

        s2.display();
        s1.display();
    }
    
}
