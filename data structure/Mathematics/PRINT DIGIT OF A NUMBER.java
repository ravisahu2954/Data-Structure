QUESTION LINK : https://www.pepcoding.com/resources/online-java-foundation/getting-started/digits-of-a-number-official/ojquestion

SOLUTION :

import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int temp =n,count=0;
       while(temp>0)
       {
           temp=temp/10;
           count++;
        }
        int t = (int) Math.pow(10,count-1);
         
        while(t>0)
        {
        System.out.println(n/t);
            n=n%t;
            t=t/10;
        }
    }
}
