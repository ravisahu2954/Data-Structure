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
        mergesort(arr,0,n-1);   
        
      //  for(int i=0;i<n;i++)
       //    System.out.print(arr[i]+" ");    
       System.out.println(count);    
    }
     private static void mergesort(int arr[],int s,int e)
    {
    
        if(s<e)
         {
              int mid = s+(e-s)/2;
              mergesort(arr,s,mid);
              mergesort(arr,mid+1,e);
              merge(arr,s,mid,e); 
         }
   }
   private static void merge(int arr[],int s,int mid,int e)
    {
       int n1=mid-s+1;
       int n2=e-mid;
       int ar1[] = new int[n1];
       int ar2[] = new int[n2];
       int t=s;
       for(int i=0;i<n1;i++)
         ar1[i]=arr[t++];
       int j=mid+1;  
      for(int i=0;i<n2;i++)
         ar2[i]=arr[j++];
    
      int i=0,k=s; 
      j=0;   
      while(i<n1 && j<n2)
        {
           if(ar1[i]>ar2[j])
              {
                   arr[k]=ar2[j++];
                    count+=(n1-i);
              }
            else
             {
                   arr[k]=ar1[i++];
             }
             k++;
         }
       while(i<n1)
       {
           arr[k++]=ar1[i++];
       }  
       while(j<n2)
       {
           arr[k++]=ar2[j++];
       } 
    }
 }
