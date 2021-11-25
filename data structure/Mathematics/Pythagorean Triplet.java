QUESTION LINK : https://www.pepcoding.com/resources/online-java-foundation/getting-started/pythagorean-triplet-official/ojquestion

SOLUTION :

  import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
       
       Scanner sc = new Scanner (System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c= sc.nextInt();
       int temp = Math.max(Math.max(a,b),c);
       if(temp ==c && temp*temp==a*a+b*b)
         System.out.println(true);
       else if(temp ==a && temp*temp==c*c+b*b)
         System.out.println(true);
        else if(temp ==b && temp*temp==a*a+c*c)
         System.out.println(true);
        else
         System.out.println(false);
     
   }
  }
