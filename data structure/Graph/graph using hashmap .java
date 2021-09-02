import java.util.*;
class Path
{
    String dest;
    int weight;
    Path(String dest,int weight)
    {
        this.dest = dest;
        this.weight = weight;
    }
}
public class HelloWorld{

     HashMap<String,ArrayList<Path>> arr = new HashMap<>();
     private  void as()
     {
         for(int i=0;i<4;i++)
            arr.add(new ArrayList());
     }
     private void create_graph(String cur , String dest , int w)
     {
         Path edge = new Path(dest,w);
         Path edge1 = new Path(cur,w);
         arr.get(cur).add(edge);
         arr.get(dest).add(edge1);
         
     }
      private void print()
      {
          
          for(int i=0;i<4;i++)
           {
               System.out.println("current  :"+i + " :");
               for(Path p : arr.get(i))
                 System.out.println("dest :"+p.dest +" weight : "+p.weight + " ");
                 System.out.println("");
           }
           
      }
      
     
     
     public static void main(String []args){
         
          
          HelloWorld obj = new  HelloWorld();
          obj.as();
          obj.create_graph("indore","delhi",200);
          obj.create_graph("indore","mumbai",100);
          obj.create_graph("mumbai","bhopal",500);
          obj.create_graph("bhopal","delhi",650);
          obj.print();
        //  System.out.println("enter number of edge");
     }
}
