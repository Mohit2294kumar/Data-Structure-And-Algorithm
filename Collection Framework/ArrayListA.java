import java.util.*;
public class ArrayListA{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("is");
        list.addFirst("This");
        list.addLast("first");
        list.add(2,"my");
        list.add("program");
        System.out.println(list+" ");
        System.out.println(list.get(3)+" ");
        System.out.println(list.size()+" ");
        Collections.reverse(list);
        System.out.println(list+" ");
        Collections.sort(list);
        System.out.println(list+" ");
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println(list+" ");
        list.add("chemistry");
        list.add("Java");
        list.add("Operating System");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.set(1,"Web development");
        System.out.println(list+" ");
    }
} 