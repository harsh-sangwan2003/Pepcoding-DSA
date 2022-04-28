import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

@SuppressWarnings("Unchecked")

public class display_graph {

    public static class Edge {

        int wt;
        int src;
        int nbr;

        Edge() {

        }

        Edge(int src, int nbr, int wt) {

            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vtces = Integer.parseInt(br.readLine());

        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++)
            graph[i] = new ArrayList<>();

        int edges = Integer.parseInt(br.readLine());

        for (int i = 0; i < edges; i++) {

            String str = br.readLine();
            String[] arr = str.split(" ");

            int u = Integer.parseInt(arr[0]);
            int v = Integer.parseInt(arr[1]);
            int w = Integer.parseInt(arr[2]);

            graph[u].add(new Edge(u, v, w));
            graph[v].add(new Edge(v, u, w));
        }

        display(graph);
    }

    public static void display(ArrayList<Edge>[] graph) {

        System.out.println();

        for (ArrayList<Edge> al : graph) {

            for (Edge e : al) {

                System.out.print(e.src + "-" + e.nbr + "@" + e.wt + ", ");
            }

            System.out.println();
        }
    }
}
