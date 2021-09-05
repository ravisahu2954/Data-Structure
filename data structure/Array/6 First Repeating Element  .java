#day2
 using hashmap...........
public static int firstRepeated(int[] arr, int n) {
        
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i=0 ;i <arr.length ; i++)
        {
            if(hm.containsKey(arr[i]))
               hm.put(arr[i],hm.get(arr[i])+1);
            else
            hm.put(arr[i],1);
        }
        for(int i=0 ; i<arr.length ; i++)
           {
               if(hm.get(arr[i])>1)
                 return i+1;
           }
        return -1;
        
    }
///*******//
Expected Time Complexity: O(n)
Expected Auxilliary Space: O(n)
//*******//
 using HashSet ...........
         public static int firstRepeated(int[] arr, int n) {
        int min=-1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=n-1 ;i>=0 ; i--)
        {
            if(hs.contains(arr[i]))
               min=i;
            else
            hs.add(arr[i]);
        }
        if(min!=-1)
        return min+1;
        else
         return min;
        
    }
