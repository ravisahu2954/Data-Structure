public class HelloWorld{

     public static void main(String []args){
        String binary="cbcaba";
      String str="";
      int count=0;  
      for(int i=0;i<binary.length();i++)
      {
          for(int j=i;j<binary.length();j++)
          {
              if(isPalindrome (binary.substring(i,j+1))==1)
                 System.out.println(binary.substring(i,j+1));
           }
     }
  }
  static int isPalindrome(String S) {
        
       int j = 0 , l = S.length()-1;
       while(j<l)
       {
           if(S.charAt(j++) != S.charAt(l--))
             return 0;
       }
       return 1; 
    }
}
