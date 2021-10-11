

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
		  if(number%2==0)
		    {
		          temp=1;
		          break;
		    }
		      
		}
		if(temp==0 && number!=1)
		   System.out.println("number is prime "+ number);
		else
		   System.out.println("number is not prime "+ number); 
	}
}
