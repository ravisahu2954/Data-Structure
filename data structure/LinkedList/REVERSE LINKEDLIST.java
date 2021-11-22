QUESTION LINK : https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1#

Solution 1:

 Node reverseList(Node head)
    {
        Node cur=null,Next=head,prev=null;
        while(Next!=null)
        {
           cur=Next.next;
           Next.next=prev;
           prev=Next;
           Next=cur;
        }
        return prev;
    }

Solution 2 :
