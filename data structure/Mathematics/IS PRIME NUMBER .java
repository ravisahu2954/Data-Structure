

import java.util.*;
import java.lang.*;
import java.io.*;
class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
	      Scanner sc = new Scanner(System.in);
	      int number = sc.nextInt();
		int temp=0;
		for(int i=2;i<number;i++)
		{
		  if(number%i==0)
		    {
		          temp=1;
		          break;
		    }
		      
		}
		if(temp==0)
		   System.out.println("number is prime "+ number);
		else
		   System.out.println("number is not prime "+ number); 
	}
}
///
///
//
this is also work 
 for(int i=2;i<=number/2;i++)   //i<=number/2
     {
	if(number%i==0)
	    {
		temp=1;
	         break;
	    }
		      
     }
/////
///
//
efficient algorithm

 for(int i=2;i*i<=number;i++)   //i*i<=number , i^2<=number , i=sqrt(number)
     {
	if(number%i==0)
	    {
		temp=1;
	         break;
	    }
		      
     }


