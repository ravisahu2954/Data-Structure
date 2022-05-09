Question link : https://leetcode.com/problems/find-if-path-exists-in-graph/

soution : 
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
        return dfs(arr,vis,source,destination);
    }
    private boolean dfs (ArrayList<ArrayList<Integer>> arr , boolean vis[],int s,int d)
    {
         if(s==d)
             return true;
        vis[s]=true;
         for(int i : arr.get(s))
            {
                if(vis[i]==false)
                {
                   if(dfs(arr,vis,i,d))
                       return true;
                }
            }
            
        
       return false;
    }
}
