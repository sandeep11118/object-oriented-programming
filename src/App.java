import java.util.*;
public class App {

    int id;
    String name; 

     App(int i,String a ){
        id = i;
        name = a;
    }

    void display(){
        System.out.println(id+" "+name+" ");
    }
    
    public static void main(String[] args) throws Exception {
        App s1 = new App(111,"sandeep");
        s1.display();

    }
}
