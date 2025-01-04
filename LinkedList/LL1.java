public class LL1{
    Node head;
    private int size;
    LL1(){
        size=0;
    }
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void printlist(){
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
    public void addAtIndex(int data, int index){
        if(index > size || index < 0){
            System.out.println("Invalid index value");
            return;
        }
        size++;
        Node newNode = new Node(data);
        if(head==null||index==0){
            newNode.next=head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for(int i=1; i<size; i++){
            if(i==index){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }
    public void removefirst(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        head = head.next;
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
        while(lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }
    public int getsize(){
        return size;        
    }
    public static void main(String[] args){
        LL1 list = new LL1();
        list.addfirst(5);
        list.addAtIndex(84, 0);
        list.printlist();

    }
}