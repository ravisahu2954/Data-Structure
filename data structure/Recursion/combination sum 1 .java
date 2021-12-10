Question link : https://leetcode.com/problems/combination-sum/submissions/

Solution : 

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> list = new ArrayList<>();
        int size = candidates.length;
        findsum(candidates,size,0,target,new ArrayList<>(),list,0);
        return list;
    }
    private void findsum(int []arr,int size,int i, int target,List<Integer> l,List<List<Integer>> list,int sum)
    {
    
        if(sum>target || i>=size)
          return;
        
       if(target==sum)
        {
           list.add(new ArrayList<>(l));
           return;
        }  
        if(sum<target)
        {   
         l.add(arr[i]);
         findsum(arr,size,i,target,l,list,sum+arr[i]);
         l.remove(l.size()-1);   
        }    
        findsum(arr,size,i+1,target,l,list,sum);
    
        
    }
}

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
