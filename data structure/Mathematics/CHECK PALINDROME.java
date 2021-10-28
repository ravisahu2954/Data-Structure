
	private static boolean f(int n)
	{
	   int count=0;
	   int temp=n;
	   int num=0;
	   while(n>0)
	   {
	         num=num*10+n%10;
	         n=n/10;
	   }
	    return (temp==num)
	}
