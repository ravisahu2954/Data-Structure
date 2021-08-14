package ds_series;
import java.util.*;

class Graph {
    
   
    public void create(ArrayList<ArrayList<Integer> > adj,int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

   
    public void print(ArrayList<ArrayList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print("\nArraylist of  " + i);
            for (int j :adj.get(i)) {
                System.out.print(" -> "+j);
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args)
    {
      
        int V = 4;
        Graph obj = new Graph();
        ArrayList<ArrayList<Integer> > adj  = new ArrayList<ArrayList<Integer> >(V);
        boolean vi[]=new boolean[V];
        
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        obj.create(adj, 0, 1);
        obj.create(adj, 1, 2);
        obj.create(adj, 3, 0);
        obj.create(adj, 2, 3);
      //  obj.dfs(adj,0,vi);
        obj.bfs(adj,0,vi);
      
        
     //   obj.print(adj);
    }


	private void bfs(ArrayList<ArrayList<Integer>> adj,int i ,boolean vi[]) {
	   Queue<Integer> q=new LinkedList<Integer>();
	   vi[i]=true;
	   q.add(i);
	   while(q.isEmpty()==false)
       {
		   int u=q.poll();
		   System.out.print(u+" ");
		   for(int v: adj.get(i))
		   {
			   if(vi[v]==false)
			   {
				   vi[v]=true;
				   q.add(v);
			   }
		   }
	   }
	}


	private void dfs(ArrayList<ArrayList<Integer>> adj, int i, boolean[] vi) {
		
		
		System.out.print(i +" ");
		
		for(int t:adj.get(i))
		{
			if(vi[t]==false)
				dfs(adj,t,vi);
		}
		
	}
}

