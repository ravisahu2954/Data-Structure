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
         int arr[][] =  new int[m][n];
         arr[1][1]=1;
         arr[2][1]=1;
         arr[1][2]=1;
         arr[3][1]=1;
         
         boolean b[][] = new boolean[m][n];
         printAll(0,0,m,n,arr,"",b);
     }
     private static void printAll(int i,int j,int m,int n,int arr[][],String s,boolean b[][]) 
     {
         if(i==m-1 && j==n-1)
           {
              System.out.println(s);
              return ;
           }
         //  System.out.println(i + " "+j );
         if(i>m-1 || j>n-1  || i<0 || j<0 ||arr[i][j]==1 || b[i][j]==true)
             return;
         b[i][j]=true;
         printAll(i+1,j,m,n,arr,s+"D",b);
         printAll(i,j+1,m,n,arr,s+"R",b);
         printAll(i-1,j,m,n,arr,s+"U",b);
         printAll(i,j-1,m,n,arr,s+"L",b);
         b[i][j] = false;   
     }  
} 
input : 5 5
output :  
DDDDRRRRimport java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
    public static void main(String []args)
    {
         Scanner sc = new Scanner(System.in);
         int m = sc.nextInt();
         int n = sc.nextInt();
         int arr[][] =  new int[m][n];
         arr[1][1]=1;
         arr[2][1]=1;
         arr[1][2]=1;
         arr[3][1]=1;
         
         boolean b[][] = new boolean[m][n];
         printAll(0,0,m,n,arr,"",b);
     }
     private static void printAll(int i,int j,int m,int n,int arr[][],String s,boolean b[][]) 
     {
         if(i==m-1 && j==n-1)
           {
              System.out.println(s);
              return ;
           }
         //  System.out.println(i + " "+j );
         if(i>m-1 || j>n-1  || i<0 || j<0 ||arr[i][j]==1 || b[i][j]==true)
             return;
         b[i][j]=true;
         printAll(i+1,j,m,n,arr,s+"D",b);
         printAll(i,j+1,m,n,arr,s+"R",b);
         printAll(i-1,j,m,n,arr,s+"U",b);
         printAll(i,j-1,m,n,arr,s+"L",b);
         b[i][j] = false;   
     }  
} 
input : 5 5
output :  
DDDDRRRR
DDDDRRRURD
DDDDRRRUURDD
DDDDRRRUUURDDD
DDDDRRRUUUURDDDD
DDDDRRRULURRDD
DDDDRRRULURURDDD
DDDDRRRULURUURDDDD
DDDDRRURDR
DDDDRRURRD
DDDDRRURURDD
DDDDRRURUURDDD
DDDDRRURUUURDDDD
DDDDRRUURDDR
DDDDRRUURDRD
DDDDRRUURRDD
DDDDRRUURRDLDR
DDDDRRUURURDDD
DDDDRRUURURDDLDR
DDDDRRUURUURDDDD
DDDDRRUURUURDDDLDR
RRRDDDDR
RRRDDDRD
RRRDDDLDRR
RRRDDRDD
RRRDDRDLDR
RRRDDRDLLDRR
RRRDDLDDRR
RRRDDLDDRURD
RRRDDLDRDR
RRRDDLDRRD
RRRDRDDD
RRRDRDDLDR
RRRDRDDLULDDRR
RRRDRDDLLDRR
RRRDRDLDDR
RRRDRDLDRD
RRRDRDLDLDRR
RRRDRDLLDDRR
RRRDRDLLDDRURD
RRRDRDLLDRDR
RRRDRDLLDRRD
RRRRDDDD
RRRRDDDLDR
RRRRDDDLULDDRR
RRRRDDDLLDRR
RRRRDDLDDR
RRRRDDLDRD
RRRRDDLDLDRR
RRRRDDLLDDRR
RRRRDDLLDDRURD
RRRRDDLLDRDR
RRRRDDLLDRRD
RRRRDLDDDR
RRRRDLDDRD
RRRRDLDDLDRR
RRRRDLDRDD
RRRRDLDRDLDR
RRRRDLDRDLLDRR
RRRRDLDLDDRR
RRRRDLDLDDRURD
RRRRDLDLDRDR
RRRRDLDLDRRD
DDDDRRRURD
DDDDRRRUURDD
DDDDRRRUUURDDD
DDDDRRRUUUURDDDD
DDDDRRRULURRDD
DDDDRRRULURURDDD
DDDDRRRULURUURDDDD
DDDDRRURDR
DDDDRRURRD
DDDDRRURURDD
DDDDRRURUURDDD
DDDDRRURUUURDDDD
DDDDRRUURDDR
DDDDRRUURDRD
DDDDRRUURRDD
DDDDRRUURRDLDR
DDDDRRUURURDDD
DDDDRRUURURDDLDR
DDDDRRUURUURDDDD
DDDDRRUURUURDDDLDR
RRRDDDDR
RRRDDDRD
RRRDDDLDRR
RRRDDRDD
RRRDDRDLDR
RRRDDRDLLDRR
RRRDDLDDRR
RRRDDLDDRURD
RRRDDLDRDR
RRRDDLDRRD
RRRDRDDD
RRRDRDDLDR
RRRDRDDLULDDRR
RRRDRDDLLDRR
RRRDRDLDDR
RRRDRDLDRD
RRRDRDLDLDRR
RRRDRDLLDDRR
RRRDRDLLDDRURD
RRRDRDLLDRDR
RRRDRDLLDRRD
RRRRDDDD
RRRRDDDLDR
RRRRDDDLULDDRR
RRRRDDDLLDRR
RRRRDDLDDR
RRRRDDLDRD
RRRRDDLDLDRR
RRRRDDLLDDRR
RRRRDDLLDDRURD
RRRRDDLLDRDR
RRRRDDLLDRRD
RRRRDLDDDR
RRRRDLDDRD
RRRRDLDDLDRR
RRRRDLDRDD
RRRRDLDRDLDR
RRRRDLDRDLLDRR
RRRRDLDLDDRR
RRRRDLDLDDRURD
RRRRDLDLDRDR
RRRRDLDLDRRD
