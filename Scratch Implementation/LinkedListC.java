public class LinkedListC{
    Node head;
    Node tail;

    public LinkedListC() {
        head = null;
        tail = null;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insert(int data){
        Node newnNode = new Node(data);
        if(head == null){
            head = newnNode;
            tail = newnNode;
            tail.next = head;
            return;
        }else{
            tail.next = newnNode;
            tail = newnNode;
            tail.next = head;
        }
    }
    public void remove(){
        if(head == null){
            System.out.println("empty list");
            return;
        }
        if(head==tail){
            head = null;
            tail = null;
        }
        else{
            Node currNode = head;
            while(currNode.next != tail){
                currNode = currNode.next;
            }
            currNode.next = head;
            tail = currNode;
        }
    }
    public void printList(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        Node currNode = head;
        do { 
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        } while (currNode != head);
        System.out.println(head.data);
    }
    public static void main(String[] args){
        LinkedListC list = new LinkedListC();
        list.insert(4);
        list.insert(3);
        list.insert(83);
        list.insert(39);
        list.remove();
        list.printList();
    }
}