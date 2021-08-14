package ds_series;

public class Binary_S_Tree {
	class Node{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
		}
	}
	private Node root=null;


	public static void main(String[] args) {
		
		Binary_S_Tree obj = new Binary_S_Tree();
		obj.root=obj.insert(obj.root,10);
		obj.root=obj.insert(obj.root,20);
	/*.root=obj.create_tree(obj.root,8);
		obj.root=obj.create_tree(obj.root,30);
		obj.root=obj.create_tree(obj.root,5);*/
		obj.traverse(obj.root);

	}

	private void traverse(Node root) {
		
		if(root==null)
			return ;
		System.out.print(root.data +" ");
		traverse(root.left);
		traverse(root.right);
		
	}
  
	public Node insert(Node root, int data)
    {
         if(root==null)
              return new Node(data);
         else{
               if(root.data>data)
                    root.left=insert(root.left,data);
               else if(root.data<data)
                    root.right=insert(root.right,data);
             }
        return root;
   }
	private Node create_tree(Node n,int num) {
		
		if(root==null)
			return new Node(num);
		else {
		   if(root.data>=num)
		       root.left=create_tree(root.left , num);
		
		  else if(root.data<=num)
	       root.right=create_tree(root.right , num);
		
		}
		return root;
		
		
	}

}
