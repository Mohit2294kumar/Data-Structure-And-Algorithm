//scratch implementation by using Linked list
public class StackLL{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stack{
        public static Node head = null;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push (int data){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            Node top = head;
            return top.data;
        }
    }
    public static void main(String[] args){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}