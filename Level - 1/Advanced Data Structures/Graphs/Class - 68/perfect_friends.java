import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.List;
import java.util.ArrayList;

public class perfect_friends {

    public static class Edge {

        int src;
        int nbr;

        Edge(int src, int nbr) {

            this.src = src;
            this.nbr = nbr;
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        // write your code here
        ArrayList<Edge>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for (int i = 0; i < k; i++) {

            String str = br.readLine();
            String[] parts = str.split(" ");

            int u = Integer.parseInt(parts[0]);
            int v = Integer.parseInt(parts[1]);

            graph[u].add(new Edge(u, v));
            graph[v].add(new Edge(v, u));
        }

        List<List<Integer>> comps = new ArrayList<>();
        boolean[] visit = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (!visit[i]) {

                List<Integer> list = new ArrayList<>();
                dfs(graph, i, list, visit);
                comps.add(list);
            }
        }

        int ans = 0;

        for (int i = 0; i < comps.size(); i++) {

            for (int j = i + 1; j < comps.size(); j++) {

                int pair = comps.get(i).size() * comps.get(j).size();
                ans += pair;
            }
        }

        System.out.println(ans);

    }

    public static void dfs(ArrayList<Edge>[] graph, int i, List<Integer> list, boolean[] visit) {

        list.add(i);
        visit[i] = true;

        for (Edge e : graph[i]) {

            if (!visit[e.nbr])
                dfs(graph, e.nbr, list, visit);
        }

    }

}