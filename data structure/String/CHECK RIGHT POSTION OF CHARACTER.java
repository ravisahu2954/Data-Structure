PROBLEM : count how many character are at right postion .
constrains : str {a to z ,A to Z};
input : 
Example : str = " abxyc "  
output:
2
explanation -:  a and b at right position


solution : 
import java.util.*;
import java.lang.*;
import java.io.*;
public class First{

   public static void main(String []args) throws java.lang.Exception
   {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      helper(str);
      
   }
   private static void helper (String str)
   {
   
      int count=0;
      for(int i=0; i <str.length();i++)
      {
          int c = Character.toLowerCase(str.charAt(i));
          if(c-97==i)
           ++count;
      
      }
      System.out.println(count);
   
   }

   
}   

