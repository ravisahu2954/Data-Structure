package struture_data;

import java.util.*;

public class Stack_array {
	int top,size;
	int arr[];
	Stack_array(int size)
	{
		top=-1;
		this.size=size;
		arr=new int[size];
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter max size of stack :");
		int si=sc.nextInt();
		Stack_array obj=new Stack_array(si);
		
		System.out.println("do you want perform  opertion on stack :");
		char ch=sc.next().charAt(0);
		
		while(ch!='n') {
		System.out.println("enter your choice :");
		System.out.println("press 1 for insertion :");
		System.out.println("press 2 for pop :");
		System.out.println("press 3 for print data :");
		System.out.println("press 4 for peek value :");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter new  number :");
			int data=sc.nextInt();
			obj.push(data);
			break;
		case 2:
			obj.pop();
			break;
		case 3:
			obj.print();
			break;
		case 4:
			System.out.println("peek value is :" +obj.peek());
			break;
	    //default 
	        
		}
		System.out.println("do you want perform opertaion again :");
		 ch=sc.next().charAt(0);
		
	 }

	}


	public int peek() {
		if(top==-1)
			return 0;
		else
		return arr[top];
		
	}


	public void print() {
		System.out.println("element in stack");
		for(int i=0;i<=top;i++)
			System.out.print(arr[i]+ " ");
		System.out.println();
	}


	public void pop() {
		if(top==-1)
			System.out.println("stack empty");
		else {
			arr[top]=0;
		    top--;
		}
		
	}


	public  void push(int data) {
		if(top==size-1)
			System.out.println("stack is full");
		else
		{
			arr[++top]=data;
		}
	   	
		
	}

}
