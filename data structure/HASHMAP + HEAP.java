https://leetcode.com/problems/sort-characters-by-frequency/
class Pair implements Comparable<Pair>{
    
    char ch;
    int frq;
    Pair(char ch,int frq)
    {
        this.ch = ch;
        this.frq = frq;
    }
    public int compareTo(Pair o)
    {
        return o.frq-this.frq;
    }
}
class Solution {
    public String frequencySort(String s) {
          // HASHMAP + HEAP ;
          PriorityQueue<Pair> pq = new PriorityQueue<>();
          String ans = "";
          int countFrq[] = new int[256];
          for(int i=0;i<s.length();i++)
          {
              char chh = s.charAt(i);
              countFrq[chh]++;
          }
          for(int i=0;i<256;i++)
          {
              int temp = countFrq[i];
              char ch = (char)i;
              if(temp!=0)
              {
                pq.add(new Pair(ch,temp));  
              }
                
          }
          while(!pq.isEmpty())
          {
              Pair o = pq.poll();
              for(int i=1;i<=o.frq;i++)
              {
                  ans+=o.ch;
              }
          }
          return ans;
    }
}

simple version
::
	hashmap+head with integer :https://leetcode.com/submissions/detail/762595427/
	
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
HashMap + headp with Character : https://leetcode.com/submissions/detail/762605776/

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
            hm.merge(s.charAt(i),1,Integer::sum);
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->(hm.get(b)-hm.get(a)));
        for(char c:hm.keySet())
            pq.add(c);
        String ans="";
        while(!pq.isEmpty())
        {
            char c = pq.poll(); 
            ans+=String.valueOf(c).repeat(hm.get(c));
        }
        return ans;
    }
}
