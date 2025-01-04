public class stackLL{
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class stack{
        public static Node head = null;

        public boolean isEmpty(){
            return head == null;
        }

        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        public int peek() {
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            return top.data;
        }

    }
    public static void main(String[] args) {
        stack list = new stack();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        while(!list.isEmpty()){
            System.out.print(list.peek()+" ");
            list.pop();
        }
        
    }
}