public class LinkedListS{
    Node head;
    int size;

    public LinkedListS() {
        size = 0;
    }
    
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addList(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void removeList(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        head = this.head.next;
        size--;
    }
    public void addLast(int data){
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
    public void removeLast(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }
    public void printList(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
            size++;
        }
        
        System.out.println("null");
    }
    public int  getsize(){
        return size;
    }
    public static void main(String[] args) {
        LinkedListS list = new LinkedListS();
        list.addList(98);
        list.addList(48);
        list.addList(1);
        list.addList(4);
        list.addList(84);
        list.removeList();
        list.printList();
        //list.removeList();
        int x = list.getsize();
        System.out.println(x);
        list.removeLast();
        list.printList();
    }
}