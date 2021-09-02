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
            arr.put("",new ArrayList());
     }
     private void create_graph(String cur , String dest , int w)
     {
         Path edge = new Path(dest,w);
         Path edge1 = new Path(cur,w);
         if(!arr.containsKey(cur))
          arr.put(cur ,new ArrayList());
         if(!arr.containsKey(dest))
          arr.put(dest ,new ArrayList());
         arr.get(cur).add(edge);
         arr.get(dest).add(edge1);
         
     }
      private void print()
      {
          for (Map.Entry i : arr.entrySet()) {   
            String key = (String)i.getKey();
            ArrayList<Path> value = (ArrayList<Path>)i.getValue();
    
          for(Path val : value){
          System.out.print(key +" -> " );
          System.out.print(val.dest + " " + val.weight + " , ");
          }
          System.out.println("");
           
       }
           
      }
       public static void main(String []args){
         
           HelloWorld obj = new  HelloWorld();
          obj.create_graph("indore","delhi",200);
          obj.create_graph("indore","mumbai",100);
          obj.create_graph("mumbai","bhopal",500);
          obj.create_graph("bhopal","delhi",650);
          obj.print();
     }
}
//////*******************//////////////
output:::
 mumbai -> indore 100 , mumbai -> bhopal 500 , 
indore -> delhi 200 , indore -> mumbai 100 , 
bhopal -> mumbai 500 , bhopal -> delhi 650 , 
delhi -> indore 200 , delhi -> bhopal 650 , 
