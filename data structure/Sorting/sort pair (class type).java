import java.util.*;
import java.lang.*;
import java.io.*;

class Pair implements Comparable<Pair>
{
      String stname ; 
      int id ;
      int roll;
      Pair(String stname,int id,int roll)
      {
            this.stname = stname;
            this.id = id;
            this.roll = roll;
            
      }
      public int compareTo(Pair o)
      {
          return this.roll-o.roll;
      }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Pair arr[] = new Pair[5];
		arr[0] = new Pair("ravi",1,52010094);
	      arr[1] = new Pair("brajesh",2,52010055);
	      arr[2] = new Pair("abhishek",30,52010063);
	      arr[3] = new Pair("harsimran",10,52010064);
	      arr[4] = new Pair("gaurav",4,52010030);
	      for(int i=0;i<5;i++)
	      {
	            System.out.println(arr[i].stname + " "+ arr[i].id +" "+arr[i].roll);
	      }
	      Arrays.sort(arr);
	      System.out.println("after sorting");
	       for(int i=0;i<5;i++)
	      {
	            System.out.println(arr[i].stname + " "+ arr[i].id +" "+arr[i].roll);
	      }
		
	}
}
