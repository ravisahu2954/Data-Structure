LEAST COMMON MULTIPLE
import java.util.*;
import java.lang.*;
import java.io.*;
class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int a=24,b=18;
		int num1=a,num2=b;
		
		while(num1!=0)
		{
		     int temp = num2%num1;
		      num2=num1;
		      num1=temp;
		      
		}
    int gcd=num2;
    int lcm = (a*b)/gcd;
		System.out.println("least common m : "+ lcm);
	}
}
.
.
.
.  
