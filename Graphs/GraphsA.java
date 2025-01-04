import java.util.*;
public class GraphsA{
    static class Edges{
        int src;
        int dest;
        public Edges(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edges> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edges>(); 
        }
        graph[1].add(new Edges(1, 2));
        graph[1].add(new Edges(1, 3));
        graph[2].add(new Edges(2, 1));
        graph[2].add(new Edges(2, 3));
        graph[2].add(new Edges(2, 5));
        graph[3].add(new Edges(3, 1));
        graph[3].add(new Edges(3, 2));
        graph[3].add(new Edges(3, 4));
        graph[4].add(new Edges(4, 3));
        graph[4].add(new Edges(4, 5));
        graph[5].add(new Edges(5, 2));
        graph[5].add(new Edges(5, 3));
        graph[5].add(new Edges(5, 4));
    }
    public static void main (String[] args){
        int v = 5;
        ArrayList<Edges> graph[] = new ArrayList[v+1];
        createGraph(graph);
        for(int i=0; i<graph[5].size(); i++){
            Edges e = graph[5].get(i);
            System.out.print(e.dest+" ");
        }
    }
}