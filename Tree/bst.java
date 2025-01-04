public class bst{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static Node insert(Node root, int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean binarySearch(Node root, int key) {
        if (root == null) {
            return false; 
        }
        if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return binarySearch(root.left, key);
        } else {
            return binarySearch(root.right, key);
        }
    }
    public static Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static Node delete(Node root, int val){
        if(root.data>val){
            root.left=delete(root.left, val);
        }else if(root.data<val){
            root.right=delete(root.right, val);
        }else{
            //root.data==val;
            if(root.left==null&&root.right==null){
                return null;
            }
            if(root.left==null&&root.right==null){
                return  root.right;
            }else if(root.right==null){
                return root.left;
            }
            Node is=inorderSuccessor(root.right);
            root.data=is.data;
            root.right=delete(root.right, is.data);
        }
        return root;
    }
    public static void main(String[] args){
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        if(binarySearch(root, 7)){
            System.out.println("found");
        }else{
            System.out.println("Not found");
        }
        Node successor = inorderSuccessor(root.right);
        if (successor != null) {
            System.out.println("Inorder successor: " + successor.data);
        }

        root = delete(root, 5);
        System.out.print("Inorder traversal after deletion: ");
        inorder(root);
        System.out.println();

    }
}