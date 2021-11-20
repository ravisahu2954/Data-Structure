QUESTION LINK: https://leetcode.com/problems/permutations/
NOTE: All the integers of ARRAY are unique.
 import java.util.*;
 import java.io.*;
 public class TestClass
 {
    static long count=0;
    public static void main(String []args)
     {
         
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
           arr[i]= sc.nextInt();
         int ar[] = new int[n];   
         ArrayList<Integer> l = new ArrayList<>(); 	
         findall(arr , l,ar);
        
  //      for(int i=0;i<n;i++)
   //        System.out.print(arr[i]+" ");    
       
    }
    private static void findall(int arr[] ,ArrayList<Integer> l,int ar[])
    {
            if(l.size()==arr.length)
            {
              System.out.println(l);
              return;
            }     
            for(int i=0;i<arr.length;i++)
            {
                if(ar[i]==1)
                 continue;
               ar[i]=1;
               l.add(arr[i]);
               findall(arr,l,ar);
               ar[i]=0;
               l.remove(l.size()-1); 
            }
    }
    
 }
