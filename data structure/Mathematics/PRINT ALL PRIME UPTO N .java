QUESTION LINK : https://www.pepcoding.com/resources/online-java-foundation/getting-started/print-all-primes-till-n-official/ojquestion

Solution :

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        for(int i= n1 ; i<=n2;i++)
        {
            if(isprime(i))
               System.out.println(i);
        }
    }
    private static boolean isprime(int n)
    {
        
        
        for(int i=2;i*i<=n;i++)
        {
             if(n%i==0)
                return false;
        }
        return true;
        
    }
}
