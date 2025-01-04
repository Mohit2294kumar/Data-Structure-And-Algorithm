public class Trie {
    static class Node {
        Node[] children;
        boolean eow; // end of word

        public Node() {
            children = new Node[26];
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true; // Mark the end of the word
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow; // Return true if current node is end of a word
    }
    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true; 
        }
        for(int i=1; i<=key.length(); i++){
            String firstPart = key.substring(0,i);
            String secondPart = key.substring(i);
            if(search(firstPart)&&wordBreak(secondPart)){
                return true;
            }
        }
        return true;
    }
    public static boolean startWith(String prefix){
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words = {"the", "apple", "any", "there", "their"};
        String key = "theiranytheapple";
        String prefix="th";
        for (String word : words) {
            insert(word);
        }
        System.out.println(startWith(prefix));
        //System.out.println(wordBreak(key));

        // System.out.println(search("the")); // Should print true
        // System.out.println(search("these")); // Should print false
        // System.out.println(search("apple")); // Should print true
        // System.out.println(search("app")); // Should print false
    }
}
