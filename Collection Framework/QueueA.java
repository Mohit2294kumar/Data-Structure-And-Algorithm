import java.util.*;
public class QueueA{
    public static void main(String[] args){
        Queue<String> fruits = new ArrayDeque<>();
        fruits.add("Apple");
        fruits.add("Litchi");
        fruits.add("Coconut");
        fruits.add("Tomato");
        while(!fruits.isEmpty()){
            System.out.println(fruits.peek()+" ");
            fruits.remove();
        }
    }
}