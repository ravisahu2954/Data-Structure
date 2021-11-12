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
        quicksort(arr,0,n-1);   
        
        for(int i=0;i<n;i++)
           System.out.print(arr[i]+" ");    
       
    }
     private static void quicksort(int arr[],int s,int e)
    {
        if(s<e)
         {
              int pivot = findpivot(arr,s,e);
           //   System.out.println(pivot);
              quicksort(arr,s,pivot-1);
              quicksort(arr,pivot+1,e);
            }
    }
   private static int findpivot(int arr[],int s,int e)
   {
       int i=s,j=e ,pivot=arr[s];
       while(s<e)
       {
      
        while(arr[s]<=pivot && s<j)
           s++;
        while(arr[e]>pivot && i<e)
            e--;
        if(s<e)
        {    
           int temp=arr[s];
           arr[s]=arr[e];
           arr[e]=temp;
        } 
     
       }
        int  temp = arr[i];
        arr[i]=arr[e];
        arr[e]=temp;  
      
      return e;     
   }
 }
