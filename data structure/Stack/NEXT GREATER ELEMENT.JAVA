//next greater element
import java.util.*;
import java.lang.*;
import java.io.*;
public class Next{

   public static void main(String []args) throws java.lang.Exception
   {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
          arr[i] = sc.nextInt();
          helper(arr,n);
   }
   private static void helper(int arr[] , int n)
   {
       Stack<Integer> st = new Stack<>();
       int ar[] = new int[n];
       ar[n-1]=-1;
       st.push(arr[n-1]);
       for(int i =n-2 ; i>=0;i--)
       {
           while(!st.isEmpty() && arr[i]>=st.peek())
             st.pop();
           
           if(st.isEmpty())
             ar[i]=-1;
           else 
             ar[i]=st.peek();
           st.push(arr[i]);  
       }
       
       for(int i=0;i<n;i++)
          System.out.print(ar[i] +" ");
    }
   
}
