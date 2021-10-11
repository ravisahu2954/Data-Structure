 GREATEST COMMON DIVISOR
 

import java.util.*;
import java.lang.*;
import java.io.*;
class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  
	        int num1=24,num2=18;
		
		while(num1!=0)
		{
		     int temp = num2%num1;
		      num2=num1;
		      num1=temp;
		      
		}
		System.out.println("Greatest common divisor : "+ num2);
	}
}
.
.	
	
	
