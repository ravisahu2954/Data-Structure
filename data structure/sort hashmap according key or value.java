
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
    List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,4,4,5));
      for(int i : list)
         hm.merge(i,1,Integer::sum);
        System.out.println(hm);
    List<Map.Entry<Integer,Integer>> l = new ArrayList<>(hm.entrySet());
    Collections.sort(l,(a,b)->(a.getKey()-a.getKey()));//sort by key but no need of this we can use treemap
    Collections.sort(l,(a,b)->(a.getValue()-a.getValue()));//sort by value in increasing or decreasing order
    for(Map.Entry<Integer,Integer> h : l)
       System.out.println(h.getKey() + "  "+h.getValue());
    }
}
