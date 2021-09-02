HashMap<Character,Integer> hm=new HashMap<>();   
for (Map.Entry i : hm.entrySet()) {   // print hashmap 
            char key = (char)i.getKey();
            int value = ((int)i.getValue());
        
          System.out.println(key +" " + value );        
       }
