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
