Question link : https://leetcode.com/problems/find-if-path-exists-in-graph/

Solution : 
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination)     {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=1;i<=n;i++)
            arr.add(new ArrayList<Integer>());
        for(int ar[] : edges)
        {
            arr.get(ar[0]).add(ar[1]);
            arr.get(ar[1]).add(ar[0]);
        }
        boolean vis[] = new boolean[n];
        return bfs(arr,vis,source,destination);
    }
    private boolean bfs (ArrayList<ArrayList<Integer>> arr , boolean vis[],int s,int d)
    {
        
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        vis[s]=true;
        while(!q.isEmpty())
        {
            int temp = q.poll();
            if(temp==d)
                return true;
            for(int i : arr.get(temp))
            {
                if(vis[i]==false)
                {
                    q.add(i);
                    vis[i]=true;
                }
            }
            
        }
      
        return false;
    }
}
