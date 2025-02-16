import java.util.*;
public class GraphsA{
    static class Edge{
        int src, dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }
    public static void display(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            System.out.print(i + " -> ");
            for(Edge e: graph[i]){
                System.out.print("[" + e.src + " -> " + e.dest + "] ");
            }
            System.out.println();
        }
    }
    public static void bfs(ArrayList<Edge> graph[], int src, boolean visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited[src] = true;
        while(q.size() > 0){
            int rem = q.remove();
            System.out.print(rem + " ");
            for(Edge e: graph[rem]){
                if(visited[e.dest] == false){
                    visited[e.dest] = true;
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[], int src, boolean visited[]){
        visited[src] = true;
        System.out.print(src + " ");
        for(Edge e: graph[src]){
            if(visited[e.dest] == false){
                dfs(graph, e.dest, visited);
            }
        }
    }
    public static void main(String[] args){
        int n = 4;
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph);
        display(graph);
        boolean visited[] = new boolean[n];
        System.out.print("BFS: ");
        bfs(graph, 0, visited);
        System.out.println();
        Arrays.fill(visited, false);
        System.out.print("DFS: ");
        dfs(graph, 0, visited);
    }
}