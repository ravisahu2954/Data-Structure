import java.util.*;
class Path
{
    int dest;
    int weight;
    Path(int dest,int weight)
    {
        this.dest = dest;
        this.weight = weight;
    }
}
class Graph{
    
     private ArrayList<ArrayList<Path>> arr = new ArrayList<>();
     public  void as()
     {
         for(int i=0;i<4;i++)
            arr.add(new ArrayList());
     }
     public void create_graph(int cur , int dest , int w)
     {
         Path edge = new Path(dest,w);
         Path edge1 = new Path(cur,w);
         arr.get(cur).add(edge);
         arr.get(dest).add(edge1);
         
     }
     public void print_graph()
      {
        for(int i=0;i<4;i++)
          {
             System.out.println("current  :"+i + " :");
               for(Path p : arr.get(i))
                 System.out.println("dest :"+p.dest +" weight : "+p.weight + " ");
                 System.out.println("");
           }
      }
 }
public class HelloWorld{

       public static void main(String []args){
         
          Graph obj = new  Graph();
          obj.as();
          obj.create_graph(0,3,20);
          obj.create_graph(0,1,10);
          obj.create_graph(1,2,5);
          obj.create_graph(2,3,6);
          obj.print_graph();
     }
}
