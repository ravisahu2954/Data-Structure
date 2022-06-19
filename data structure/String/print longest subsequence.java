print longest subsequence and length also.
  
  

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
     static  String ans = "";
	public static void main (String[] args) throws java.lang.Exception
	{
	 	printSub("abc","",0,3);
	 	System.out.println(ans + " "+ans.length());
		
	}
	private static void printSub(String str, String subs , int i,int size)
     {
     
      if (size==0) {
            if(ans.length()<subs.length())
              ans = subs;
            return;
        }
       printSub(str,subs+str.charAt(i),i+1,size-1);
       printSub(str,subs,i+1,size-1);
    
       
    }
}

output : abc 3
  REALETED PROBLEME : same logic for smallest subsequece , same logic for SMALLEST PALINDROME OF LONGEST PALINDROME SUBSE
