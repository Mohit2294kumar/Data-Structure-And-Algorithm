import java.util.Stack;
public class Stack1{
    public static void main (String[] args){
        Stack<String> colour = new Stack<>();
        colour.push("red");
        colour.push("blue");
        colour.push("green");
        colour.push("orange");
        colour.push("purple");
        colour.push("white");
        colour.push("black");
        while(!colour.empty()){
            System.out.print("["+colour.peek()+" "+"]");
            colour.pop();
        }
    }
}