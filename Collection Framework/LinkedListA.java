import java.util.*;
public class LinkedListA{
    public static void main(String[] args) {
        LinkedList<Integer> marks = new LinkedList<>();
        marks.add(2);
        marks.addFirst(93);
        marks.addLast(48);
        marks.add(2, 39);
        marks.addAll(marks);
        System.out.println(marks+" ");
        System.out.println(marks.size()+" ");        
        for(int i=0; i<marks.size(); i++){
            System.out.print(marks.get(i)+" ");
        }
        System.out.println();
        for(int i=marks.size()-1; i>0; i--){
            System.out.print(marks.get(i)+" ");
        }
        System.out.println();
        Collections.reverse(marks);
        System.out.println(marks+" ");
    }
}