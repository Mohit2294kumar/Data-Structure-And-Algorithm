import java.util.*;

public class GraphB {
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 5));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 3));
        graph[1].add(new Edge(1, 3, 5));
        graph[1].add(new Edge(1, 4, 4));
        graph[2].add(new Edge(2, 0, 5));
        graph[2].add(new Edge(2, 1, 3));
        graph[3].add(new Edge(3, 1, 5));
        graph[3].add(new Edge(3, 4, 10));
        graph[4].add(new Edge(4, 1, 4));
        graph[4].add(new Edge(4, 3, 10));
    }

    public static void display(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + "->");
            for (Edge e : graph[i]) {
                System.out.print("(" + e.dest + ", Weight->" + e.wt + ") ");
            }
            System.out.println();
        }
    }

    public static void primAlgorithm(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> a.wt - b.wt);
        pq.add(new Edge(0, 0, 0));
        while (pq.size() > 0) {
            Edge rem = pq.remove();
            if (visited[rem.dest]) {
                continue;
            }
            visited[rem.dest] = true;
            System.out.println(rem.src + "->" + rem.dest + " Weight->" + rem.wt);
            for (Edge e : graph[rem.dest]) {
                if (!visited[e.dest]) {
                    pq.add(new Edge(rem.dest, e.dest, e.wt));
                }
            }
        }
    }

    public static void kruskalAlgorithm(ArrayList<Edge> graph[]) {
        PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> a.wt - b.wt);
        for (int i = 0; i < graph.length; i++) {
            for (Edge e : graph[i]) {
                pq.add(e);
            }
        }
        int parent[] = new int[graph.length];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        while (pq.size() > 0) {
            Edge rem = pq.remove();
            int p1 = findParent(parent, rem.src);
            int p2 = findParent(parent, rem.dest);
            if (p1 != p2) {
                parent[p1] = p2;
                System.out.println(rem.src + "->" + rem.dest + " Weight->" + rem.wt);
            }
        }
    }

    public static int findParent(int parent[], int v) {
        if (parent[v] == v) {
            return v;
        }
        return parent[v] = findParent(parent, parent[v]);
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph);
        display(graph);
        System.out.println("Prim's Algorithm");
        primAlgorithm(graph);
        System.out.println("Kruskal's Algorithm");
        kruskalAlgorithm(graph);
    }
}