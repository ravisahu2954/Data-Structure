
public class HelloWorld{

     public static void main(String []args){
      
      String binary="ravi";
      String str="";
      int count=0;  
      for(int i=0;i<binary.length();i++)
      {
          for(int j=i;j<binary.length();j++)
          {
             
              str=binary.substring(i,j+1);
              System.out.print(str+ "  ");
          }
     }
    }
}
