#day2

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
  
