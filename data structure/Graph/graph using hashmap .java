import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         
         HashMap<String ,List<String>> hm = new HashMap<>();
         hm.put("indore" , Arrays.asList("delhi" , "mumbai"));
         hm.put("mumbai" , Arrays.asList("delhi" , "indore"));
         hm.put("delhi" , Arrays.asList("indore" , "mumbai"));
         System.out.println("Hello World \n"+ hm);
     }
}
