import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
    public static void main(String []args)
    {
         Scanner sc = new Scanner(System.in);
         int m = sc.nextInt();
         int n = sc.nextInt();
         printallpath(m,n,1,1,"");
     }
     private static void printallpath(int m,int n,int i,int j,String path)
     {
         
          if(i==m && j==n)
          {
            System.out.println(path);
            return ;
          }      
          if(i>m || j>n)
             return ;
          printallpath(m,n,i+1,j,path+"v");
          printallpath(m,n,i,j+1,path+"h");
      }
} 
input : 3 2
output: vvh
        vhv 
        hvv
