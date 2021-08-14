package struture_data;

import java.util.*;
//import java.io.*;

public class Queue {

	 private class Node{
			int data;
			Node next;
			Node(int data)
			{
				this.data=data;
				next=null;
			}
		 }
		private Node front,rear;
		Queue()
		{
			front=rear=null;
		}

		public void dqueue() {
			if(front==null) {
				
				return;
			}
			else {
				front=front.next;
				if(front==null)
					rear=null;
				
			}
			
		}

	   public void enqueue(int data) {
			Node n=new Node(data);
			if(front==null) {
				front=n;
				rear=front;
				
			}
			else {
				rear.next=n;
				rear=n;
			}
			
		}
	   public void tra() {
			Node n=front;
			while(n!=null) {
				System.out.print(n.data + " ");
				n=n.next;
			}
			
		}
	
	public static void main(String[] args) {
	     
		try (Scanner sc = new Scanner(System.in)) {
			Queue obj=new 	Queue();
			System.out.println("How many number do you want to store in stack");
			int num=sc.nextInt();
			int temp=1;
			while(num-->0) {
			 System.out.println("enter number : " + temp++);
			 int nu=sc.nextInt();
			  obj.enqueue(nu);
			}
			obj.tra();
			 System.out.println("Queue Front : " + obj.front.data);
		        System.out.println("Queue Rear : " +obj.rear.data);
		}
	}

}
