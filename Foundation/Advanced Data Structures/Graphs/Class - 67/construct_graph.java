import java.util.ArrayList;

public class construct_graph {

    public static class Edge {

        int src;
        int nbr;
        int wt;

        Edge() {

        }

        Edge(int src, int nbr, int wt) {

            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void addEdge(ArrayList<Edge>[] graph, int u, int v, int wt) {

        graph[u].add(new Edge(u, v, wt));
        graph[v].add(new Edge(v, u, wt));

    }

    public static void print(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {

            for (Edge e : graph[i]) {

                System.out.println(i + " -> " + e.src + "-" + e.nbr + " " + e.wt);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int N = 7;
        ArrayList<Edge>[] graph = new ArrayList[N];

        for (int i = 0; i < graph.length; i++)
            graph[i] = new ArrayList<>();

        addEdge(graph, 0, 1, 10);
        addEdge(graph, 0, 3, 10);
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 2, 3, 40);
        addEdge(graph, 3, 4, 2);
        addEdge(graph, 4, 5, 2);
        addEdge(graph, 4, 6, 3);
        addEdge(graph, 5, 6, 8);

        print(graph);

    }
}