import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
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
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());

        // write your code here
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, src + ""));
        boolean[] visit = new boolean[vtces];

        while (q.size() != 0) {

            Pair p = q.remove();

            if (visit[p.e])
                continue;

            visit[p.e] = true;

            System.out.println(p.e + "@" + p.s);

            for (Edge e : graph[p.e]) {

                if (!visit[e.nbr])
                    q.add(new Pair(e.nbr, p.s + e.nbr));
            }
        }
    }

    public static class Pair {

        int e;
        String s;

        Pair(int e, String s) {

            this.e = e;
            this.s = s;
        }
    }
}