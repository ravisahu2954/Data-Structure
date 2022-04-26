Question link : https://leetcode.com/problems/find-k-closest-elements/

class Pair implements Comparable<Pair>{
    int val,gap;
    Pair(int val,int gap)
    {
        this.val = val;
        this.gap = gap;
    }
    public int compareTo(Pair o)
    {
        if(this.gap == o.gap)
           return this.val-o.val;
        else
        {
            return this.gap - o.gap;
        }
    }
}
class Solution {
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++)
        {
            int gap = Math.abs(x-arr[i]);
            Pair obj = new Pair(arr[i],gap);
            pq.add(obj);
        }
        for(int j=k;j<arr.length;j++)
        {
            
            int g = Math.abs(x-arr[j]);
            int pre_gap = pq.peek().gap;
            if(pre_gap>g)
             {
                pq.remove();
                Pair obj = new Pair(arr[j],g);
                pq.add(obj);
             }
        }
        while(pq.size()>0)
          list.add(pq.poll().val);
        Collections.sort(list);
        return list;
    }
}
