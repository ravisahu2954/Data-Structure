 
 
 private static void f(String str, String st , int i)
   {
     
      if (str.length() == i) {
            System.out.println(st);
            return;
        }
       f(str,st+str.charAt(i),i+1);
       f(str,st,i+1);
    
       
  }
