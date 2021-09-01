public class HelloWorld{

     public static void main(String []args){
       f("cbcaba","",0);
  }
  private static void f(String str, String st , int i)
   {
     
      if (str.length() == i)
    {
        if(isPalindrome(st)==1){
           System.out.println(st);
           return;
        }
        else
           return;
    }
    f(str,st+str.charAt(i),i+1);
    f(str,st,i+1);
    
   }
  static int isPalindrome(String S) {
       int j = 0 , l = S.length()-1;
       while(j<l)
       {
           if(S.charAt(j++) != S.charAt(l--)){
                    return 0;
           }
       }
       return 1; 
  }
}
