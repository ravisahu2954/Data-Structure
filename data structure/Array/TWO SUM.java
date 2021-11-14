QUESTION LINK : https://leetcode.com/problems/two-sum/

Soluion : 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp= new HashMap<>();
       int []p=new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            if( hp.containsKey(target-nums[i]))
            {
                p[0]=i;
                p[1]=hp.get(target-nums[i]);
                return p;
            }
            else
                hp.put(nums[i],i);
        }
        return p;
    }
}
