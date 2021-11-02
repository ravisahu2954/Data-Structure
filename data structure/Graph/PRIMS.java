  
Skip to content
Search or jump to…
Pull requests
Issues
Marketplace
Explore
 
@ravisahu2954 
ravisahu2954
/
pepcoding
Public
forked from ankitkhatriofficial/pepcoding
0
01
Code
Pull requests
Actions
Projects
Wiki
Security
Insights
Settings
pepcoding/online-java-foundation/Graphs/Shortest Path In Weights.java /
@skaterboy37
skaterboy37 Online-java-foundation
Latest commit 2199103 on 12 Apr
 History
 1 contributor
78 lines (63 sloc)  2.3 KB
  
import java.io.*;
import java.util.*;

public class Main {
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
      
        boolean[] visited = new boolean[vtces];
        
        /* print the shortest path from one vertex to all other vertex */
        dijkstra(graph, src, visited);
    }
    
    static class Pair implements Comparable<Pair>{
        int vt;
        int wt;
        public Pair(int vt,  int wt){
            this.vt = vt;
            this.wt = wt;
        }
        
        public int compareTo(Pair pair){
            return this.wt - pair.wt;
        }
    }
    
    public static void prims(ArrayList<Edge>[] graph, int src, boolean[] visited){
        
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        queue.add(new Pair(src,0));
        
        while(queue.size() > 0){
            Pair peek = queue.remove();
            
            if(visited[peek.vt] == true)
                continue;
                
            visited[peek.vt] = true;
            System.out.println(peek.vt +" " + peek.wt);
            for(Edge e : graph[peek.vt]){
                if(visited[e.nbr] == false)
                    queue.add(new Pair(e.nbr, e.wt));
            }
        }
    }
}
