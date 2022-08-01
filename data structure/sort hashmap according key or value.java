https://leetcode.com/problems/top-k-frequent-elements/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans[] = new int[k];
        for(int i=0;i<nums.length;i++)
            hm.merge(nums[i],1,Integer::sum);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(hm.get(b)-hm.get(a)));
        int temp = 0;
        for(int i : hm.keySet())
        {
            pq.add(i);
        }
        while(k-->0)
            ans[temp++]=pq.poll();
        return ans;
    }
}
