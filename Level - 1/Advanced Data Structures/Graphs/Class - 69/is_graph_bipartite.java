import java.io.*;
import java.util.*;

public class is_graph_bipartite {
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

      // write your code here
      int[] visit = new int[vtces];
      Arrays.fill(visit,-1);
      
      for(int v=0; v<vtces; v++){
          
          if(visit[v]==-1){
              
              boolean flag = isBipartite(graph,v,visit);
              
              if(!flag){
                  
                  System.out.println("false");
                  System.exit(0);
              }
          }
      }
      
      System.out.println("true");
   }
   
   public static class Pair{
       
       int src;
       int lvl;
       
       Pair(int src, int lvl){
           
           this.src = src;
           this.lvl = lvl;
       }
       
       Pair(){
           
       }
       
   }
   public static boolean isBipartite(ArrayList<Edge>[] graph, int v, int[] visit){
       
       Queue<Pair> q = new LinkedList<>();
       q.add(new Pair(v,0));
       
       while(q.size()!=0){
           
           Pair top = q.remove();
           
           if(visit[top.src]==-1){
               
               visit[top.src] = top.lvl;
           }
           
           else{
               
               if(visit[top.src]!=top.lvl)
               return false;
               
               continue;
           }
           
           for(Edge e: graph[top.src]){
               
               if(visit[e.nbr]==-1){
                   
                   q.add(new Pair(e.nbr,top.lvl+1));
               }
           }
       }
       
       return true;
   }
}