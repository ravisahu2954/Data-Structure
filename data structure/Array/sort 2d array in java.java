//********first method******//
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         int arr[][]= {{2,2},{1,1},{3,3},{1,1}};
Arrays.sort(arr, new Comparator<int[]>(){
    public int compare(int[] a, int[] b){
        return a[0] - b[0];
    }
});
 for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
            
              System.out.print(arr[i][j]+ " ");     
            }
             System.out.println("");
            
     }
     }
}
////*********************//

///*****second method**//
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         int arr[][]= {{2,2},{1,1},{3,3},{1,1}};
class Mycom implements Comparator<int[]>
{
     public int compare(int[] a, int[] b){
        return a[0] - b[0];
}
}
Arrays.sort(arr, new Mycom());

 for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
            
              System.out.print(arr[i][j]+ " ");     
            }
             System.out.println("");
            
     }
     }
}
//**********//
int mat[][] = new int[m][n];
Arrays.sort(mat,(a,b)->(a[1]-b[1]));

// 2d array k andar jo one d array h usme sirf 2 elements h toh unke 0th index k basis p sorting ho rha h
