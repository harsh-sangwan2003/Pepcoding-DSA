import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.List;
import java.util.ArrayList;

public class is_connected {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int src, List<Integer> list, boolean[] visit) {

        list.add(src);

        visit[src] = true;

        for (Edge e : graph[src]) {

            if (!visit[e.nbr]) {

                dfs(graph, e.nbr, list, visit);
            }
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        // write your code here
        List<List<Integer>> comps = new ArrayList<>();
        boolean[] visit = new boolean[vtces];

        for (int i = 0; i < vtces; i++) {

            if (!visit[i]) {

                List<Integer> list = new ArrayList<>();
                dfs(graph, i, list, visit);
                comps.add(list);
            }
        }

        if (comps.size() == 1) {

            System.out.println("true");
        }

        else {

            System.out.println("false");
        }
    }
}