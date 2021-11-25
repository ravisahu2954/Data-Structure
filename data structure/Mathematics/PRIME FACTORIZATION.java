QUESTION LINK : https://www.pepcoding.com/resources/online-java-foundation/getting-started/prime-factorization-official/ojquestion

SOLUTION 1: 
  import java.util.*;

public class Main{

public static void main(String[] args) {
  
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       for(int i=2;i<=n;)
       {
           if(n==0)
            break;
            
           else if(n%i==0)
           {
               n=n/i;
               System.out.print(i + " ");
            }
            else
               i++;
        }
    }
}

SOLUTION 2 :

  import java.util.*;

public class Main{

public static void main(String[] args) {
  
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       for(int i=2;i*i<=n;)
       {
           if(n==0)
            break;
            
           else if(n%i==0)
           {
               n=n/i;
               System.out.print(i + " ");
            }
            else
               i++;
        }
        if(n!=0)
         System.out.print(n);
    }
}
