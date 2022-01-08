link : https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1/
 using hashmap...........
public static int firstRepeated(int[] arr, int n) {
       
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i=0 ;i <arr.length ; i++)
        {
            if(hm.containsKey(arr[i]))
               return i+1;
            else
            hm.put(arr[i],1);
        }
       
        return -1;
        
    }
///*******//
Expected Time Complexity: O(n)
Expected Auxilliary Space: O(n)
//*******//
 using HashSet ...........
         public static int firstRepeated(int[] arr, int n) {
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i=n-1 ;i>=0 ; i--)
        {
            if(hs.contains(arr[i]))
               return i+1;
            else
            hs.add(arr[i]);
        }
        return -1;
        
    }
