//collection framework
import java.util.LinkedList;
import java.util.*;
public class LL{
    public static void main(String[] args){
        LinkedList<String> name = new LinkedList<>();
        name.add("Mohit");
        name.add("Abhishek");
        name.add("Nilesh");
        name.add("Utsav");
        name.add("Vivek");
        System.out.println(name);
        name.add(1,"Anaya");
        System.out.println(name);
        System.out.println(name.remove(1));
        System.out.println(name.remove());
        System.out.println(name.size());
        //System.out.println(name.isfull());
        System.out.println(name.isEmpty());
    }
}