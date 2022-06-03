import java.util.*;
public class MyClass {
    public static void main(String[] args) {
	    Integer[] arr = {2,3,5,7,11,13,17,19};

  //  Arrays.sort(input,new Comparable<Integer>());
    Arrays.sort(arr, (a,b) -> {  return  a.toString().compareTo(b.toString());});
    for(int i:arr)
		System.out.println(i);
 }
}
