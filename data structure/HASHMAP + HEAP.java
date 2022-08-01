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
	HashMap<Integer,Integer> hm= new HashMap<>();
        int arr[]=new int [k];
        for(int ele: nums){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        
        PriorityQueue <Integer> pq= new PriorityQueue<>((a,b) -> hm.get(a) - hm.get(b));
        for(int n: hm.keySet()){
            pq.add(n);
            if(pq.size()>k){
                pq.remove(); 
            }
        }
        
        int i=0;
        while(!pq.isEmpty()){
            int num=pq.remove();
            arr[i++]=num;
        }
        return arr;
