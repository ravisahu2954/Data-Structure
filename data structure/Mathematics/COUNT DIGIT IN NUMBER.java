//RECURSION VERSION
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
  
  static int count=0;
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(f(n));
	}	
  }
	private static int f(int n)
	{
	    
	    if(n==0)
	      return count;
	    count++;  
	    return f(n/10);  
	      
	}
}
///////
//ITERATIVE VERSION
private static int f(int n)
	{
	   int count=0;
	   while(n>0)
	   {
	         n=n/10;
	         count++;
	   }
	    return count; 
	 }
