import java.util.*;

public class GraphsA {
    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Creating the graph as an adjacency list
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(); // Initialize each list
        }

        // Adding edges (Undirected Graph)
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 5));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 2));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
    }

    // Breadth-First Search (BFS)
    public static void bfs(ArrayList<Edge>[] graph, int v) {
        boolean[] visited = new boolean[v + 1];
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("BFS Traversal: ");
        queue.add(1); // Start from node 1
        visited[1] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            
            for (Edge e : graph[node]) {
                if (!visited[e.dest]) {
                    queue.add(e.dest);
                    visited[e.dest] = true;
                }
            }
        }
        System.out.println();
    }

    // Depth-First Search (DFS)
    public static void dfs(ArrayList<Edge>[] graph, int v) {
        boolean[] visited = new boolean[v + 1];
        System.out.print("DFS Traversal: ");
        dfsUtil(graph, 1, visited);
        System.out.println();
    }

    private static void dfsUtil(ArrayList<Edge>[] graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (Edge e : graph[node]) {
            if (!visited[e.dest]) {
                dfsUtil(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v + 1]; // 1-based indexing
        createGraph(graph);

        // Print adjacent nodes of vertex 5
        System.out.print("Adjacent nodes of vertex 5: ");
        for (Edge e : graph[5]) {
            System.out.print(e.dest + " ");
        }
        System.out.println();

        // Perform BFS and DFS traversals
        bfs(graph, v);
        dfs(graph, v);
    }
}
