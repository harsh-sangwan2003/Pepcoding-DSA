import java.io.*;
import java.util.*;

public class hamiltonian_1 {
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

        int src = Integer.parseInt(br.readLine());

        // write all your codes here
        HashSet<Integer> set = new HashSet<>();
        dfs(graph, src, src, set, "" + src);
    }

    public static void dfs(ArrayList<Edge>[] graph, int src, int curr, HashSet<Integer> set, String path) {

        if (set.size() == graph.length - 1) {

            boolean flag = false;
            for (Edge e : graph[curr]) {

                if (e.nbr == src) {
                    path += "*";
                    flag = true;
                    break;
                }

            }

            if (!flag)
                path += ".";

            System.out.println(path);
        }

        set.add(curr);

        for (Edge e : graph[curr]) {

            if (!set.contains(e.nbr)) {

                dfs(graph, src, e.nbr, set, path + e.nbr);
            }
        }

        set.remove(curr);
    }
}