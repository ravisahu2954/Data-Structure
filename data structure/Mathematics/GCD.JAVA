 GREATEST COMMON DIVISOR
 

import java.util.*;
import java.lang.*;
import java.io.*;
class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int a=24,b=18;
		int num1=0,num2=0;
		
		while(num1!=0)
		{
		     int temp = num2%num1;
		      num2=num1;
		      num1=temp;
		      
		}
		System.out.println("Greates common divisor : "+ num2);
	}
}
