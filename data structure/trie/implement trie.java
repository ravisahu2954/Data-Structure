Question : https://leetcode.com/problems/implement-trie-prefix-tree/

Solution : 
 class Node{
    
    Node links[] = new Node[128];
    boolean flag = false;
    public boolean isContains(char c)
    {
         return links[c]!=null; 
    }
    public void put(char c)
    {
        links[c]=new Node();
    }
    public Node get(char c)
    {
        return links[c];
    }
    public void setEnd()
    {
        flag=true;
        
    }
  
}
class Trie {
    Node root;
    public Trie() {
        root= new Node();
    }
    
    public void insert(String word) {
        Node node = root;
        for(int i=0;i<word.length();i++)
        {
            if(!node.isContains(word.charAt(i)))
            {
                node.put(word.charAt(i));
            }
            node = node.get(word.charAt(i));
            
        }
        node.setEnd();
        
    }
    
    public boolean search(String word) {
        Node node = root;
         for(int i=0;i<word.length();i++)
        {
            if(!node.isContains(word.charAt(i)))
            {
                 return false;
            }
            node = node.get(word.charAt(i));
            
        }
        if(node.flag==true)
            return true;
        return false;
    }
    
    public boolean startsWith(String prefix) {
         Node node = root;
         for(int i=0;i<prefix.length();i++)
         {
            if(!node.isContains(prefix.charAt(i)))
            {
                 return false;
            }
            node = node.get(prefix.charAt(i));
            
          }
            return true;
    }
}
