import java.util.*;
import java.io.*;
public class Test1
{
    
    public static void main(String []args)
     {
         
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
         arr[i] = sc.nextInt();
        
        PriorityQueue<Integer> pq = new  PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
           if(pq.size()<k)
              pq.add(arr[i]);
           else
            {
                 
                 if(pq.peek()>arr[i])
                 {
                    pq.poll();
                    pq.add(arr[i]);
                 }
            }  
        } 
        System.out.println(pq.peek());       
      }
}
