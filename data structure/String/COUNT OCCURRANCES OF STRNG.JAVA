COUNT OCCURRANCES OF STRNG

//**********//

 public static void main(String []args){
         String str = "ababc";
         HashMap<Character , Integer> hm = new HashMap<>();
         for(int i=0 ; i<str.length() ; i++)
         {
             if(hm.containsKey(str.charAt(i)))
             {
                 hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
             }
             else
             {
                 hm.put(str.charAt(i),1);
             }
             
         }
         
       for (Map.Entry i : hm.entrySet()) {   // print hashmap 
            char key = (char)i.getKey();
            int value = ((int)i.getValue());
        
          System.out.println(key +" " + value );        
       }
         
        
     }

//*******//
Time Complexity: O(N log N), where N = length of the string passed and it generally takes logN time for an element insertion in a map.

Space Complexity: O(K), where K = size of the map
