import java.util.*;
public class StackA{
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(5);
        System.out.println(list+" ");
        list.add(3,4);
        list.addFirst(0);
        System.out.println(list+" ");
        list.addLast(6);
        list.addLast(10);
        System.out.println(list+" ");
        list.remove(list.size()-1);
        System.out.println(list+" ");
        // int size = list.size();
        // System.out.println(size+" ");
        // System.out.println(list.removeFirst()+" ");
        // System.out.println(list.removeLast());
        // System.out.println(list.get(0)+" ");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list+" ");
    }
}
