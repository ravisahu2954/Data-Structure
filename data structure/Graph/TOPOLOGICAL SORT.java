QUESTION LINK : https://practice.geeksforgeeks.org/problems/topological-sort/1#
//***********//
class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean b[] = new boolean[V];
        int arr[] = new int[V];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<V;i++)
        {
            if(b[i]==false)
                bfs(i,b,adj,st);
        }
        int j=0;
        while(!st.isEmpty())
            arr[j++]=st.pop();
        return arr;
    }
    private static void bfs(int src , boolean b[],ArrayList<ArrayList<Integer>> adj,Stack<Integer> st)
    {
              
        b[src] = true;
        for(int i : adj.get(src))
        {
            if(b[i]==false)
               bfs(i,b,adj,st);
                       
        }
        st.push(src); 
    }
}
