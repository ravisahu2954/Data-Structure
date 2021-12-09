QUESTION LINK : https://practice.geeksforgeeks.org/problems/subset-sums2234/1#

Solution :

class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        
        ArrayList<Integer> narr  = new ArrayList<>();
      
       sum(arr.size(),0,arr,narr,0);
       return narr;
    }
    private void sum(int size,int i,ArrayList<Integer> arr , ArrayList<Integer> narr,int sum)
    {
      
       if(size==0)
       {
         narr.add(sum);
         return;
       }
       sum(size-1,i+1,arr,narr,sum+arr.get(i));
       sum(size-1,i+1,arr,narr,sum);
    }
}

Input:
N = 3
arr = {5, 2, 1}
Output:
0 1 2 3 5 6 7 8
