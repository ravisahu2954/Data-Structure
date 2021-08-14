package struture_data;
import java.util.Stack;
import java.util.*;
//import java.io.*;
public class Bracket {
             
	      
	//private static Character t;

	public static void main(String[] args) {
		
      Stack<Character> s= new Stack<>();
      try (Scanner sc = new Scanner(System.in)) {
		System.out.println("enter string :");
		  String str=sc.nextLine();
		  System.out.print(check(s,str));
	}
	}

	public static  boolean check(Stack<Character> stack, String s) {
		
		for (char c : s.toCharArray()) {
			if (c == '(')
			stack.push(')');
			else if (c == '{')
			stack.push('}');
			else if (c == '[')
			stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
			return false;
			}
			return stack.isEmpty();
			}
	   }
  

