Input: arr[] = {4, 8, 12, 16} 
Output: 28 
(12, 16) is the pair with the maximum bitwise OR. 
12 | 16 = 28

SOLUTION 1 : maximum or value will be adjacent element in sorted array ;
 
 import java.util.*;
import java.io.*;
public class Test1
{
    
    public static void main(String []args)
     {
         
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
         arr[i] = sc.nextInt();
        
        Arrays.sort(arr); 
        System.out.println(arr[n-1] | arr[n-2]);       
      }
}
TIME COMPLEXITY : 0(n log(n))

SOLUTION 2: find maximum and then traverse array and find another pair element who make or greatest;

import java.util.*;
import java.io.*;
public class Test1
{
    
    public static void main(String []args)
     {
         
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
         arr[i] = sc.nextInt();
        int max=0;
        for(int i=0;i<n;i++)
         {
           if(arr[i]>max)
              max=arr[i];
         }
         int ans=0;
        for(int i=0;i<n;i++)
          ans = Math.max(ans,arr[i] | max);
        System.out.println(ans);       
      }
}

TIME COMPLEXITY : 0(n log(n))

 
