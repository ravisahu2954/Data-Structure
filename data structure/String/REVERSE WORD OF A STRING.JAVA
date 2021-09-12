public String reverseWords(String s) {
      
       String st=""; 
       String word[]=s.split(" ");
        int i=0;
       for(String str : word)
       {
           StringBuilder sb = new StringBuilder(str);
           st+= sb.reverse().toString()+" ";
           //System.out.println(word[i]);
           i++;
        }
        return st.trim();
 }
