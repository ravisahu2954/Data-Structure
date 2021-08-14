package ds_series;
public class Stack {
	public class Node{
		String data;
		Node next;
		Node(String data)
		{
			this.data=data;
		}
	}
	public Node top;
	Stack()
	{
		this.top=null;
	}
    
	public static void main(String[] args) {
	  /* Stack obj = new Stack();	
	   obj.push(10);
	   obj.push(20);
	   obj.push(30);
	  // System.out.print(obj.pop());
	   
	   obj.prString();*/

	}

	public void print() {
		
		if(top==null)
			return;
		Node t=top;
		while(t!=null) {
			System.out.print(t.data+" ");
			t=t.next;
		}
	}

	public String peek() {
		if(top==null)
			return null;
		
		return top.data;
	}

	public boolean isEmpty() {
		if(top==null)
			return true;
		return false;
	}

	public String  pop() {
		if(top==null)
			return null;
		Node pop_el=top;
		top=top.next;
		return pop_el.data;
	}

	public void push(String data) {
		
		Node node=new Node(data);
		node.next=top;
		top=node;
	}

}
