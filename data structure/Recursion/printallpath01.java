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
         int arr[][] = new int[m][n];
         arr[1][1]=1;
        // System.out.println(arr[0][0]);
         printallpath(m,n,0,0,"",arr);
     }
     private static void printallpath(int m,int n,int i,int j,String path,int arr[][])
     {
         // System.out.println("hey");
          if(i==m-1 && j==n-1)
          {
            System.out.println(path);
            return ;
          }      
          if(i>m-1 || j>n-1 || arr[i][j]==1)
             return ;
          printallpath(m,n,i+1,j,path+"v",arr);
          printallpath(m,n,i,j+1,path+"h",arr);
      }
} 
input : 3 2 
output : vvh
