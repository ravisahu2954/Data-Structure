QUESTION LINK : https://www.pepcoding.com/resources/online-java-foundation/getting-started/fibonacci-till-n-official/ojquestion

SOLUTION : 
  
  import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a=0 ,b=1;
      for(int i=0;i<n;i++)
      {
          System.out.println(a);
          int c=a+b;
          a=b;
          b=c;
       }
    }
  }
  
