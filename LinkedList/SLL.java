//scratch implementation
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class SLL{
    Node head;
    private int size;
    SLL(){
        size = 0;
    }
    public void printlist(){//traversal on a linkedlist
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void addfirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    public int getsize(){
        return size;
    }
    public void removefirst(){
        if(head == null){
            System.out.print("Empty list");
            return;
        }
        head = this.head.next;
        size--;
    }
    public void removelast(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }
    public static void main(String[] args){
        SLL list = new SLL();
        list.addfirst(5);
        list.addfirst(10);
        list.addfirst(15);
        list.addfirst(20);
        list.addlast(0);
        list.addlast(-5);
        list.printlist();
        System.out.println(list.getsize());
        list.removefirst();
        list.removelast();
        list.printlist();
    }
}