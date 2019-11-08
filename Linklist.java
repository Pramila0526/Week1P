//Program to remove duplicate node and find the middle element in one pass


package com.bridgelabz.practice;
public class Linklist 
{ 
	Node head; 

	
	static class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) 
		{
			data = d; 
		next = null;
		} 
	} 

    public static void removeDuplicate(Linklist list)
    {  
         
        Node p= list.head;
        Node index = null;
        Node temp = null;  
  
        if(list.head == null) {  
            return;  
        }  
        else 
        {  
           
        while(p!= null)
           
        {  
               temp = p;  
               index = p.next;  
  
        while(index != null)
        {  
                    
      if(p.data == index.data) 
          {  
       	temp.next = index.next;  
         }  
          else {  
             temp = index;  
                    }  
                    index = index.next;  
                }  
                p = p.next;  
            }  
        }  
    }  
    public static void printMiddle(Linklist list) 
    { 
        Node node1= list.head; 
        Node node2 = list.head; 
        if (list.head != null) 
        { 
            while (node1 != null && node1.next != null && node1.next.next!=null) 
            { 
                node1 = node1.next.next; 
                node2 = node2.next; 
            } 
            System.out.println("The middle element is [" + 
                                node2.data + "] \n"); 
        } 
    } 
  
					
	public static Linklist insert(Linklist list,int data)
	{
		Node new_node=new Node(data);
		new_node.next=null;
		if(list.head==null)
		{
			list.head=new_node;
		}
		else 
		{
		Node p=list.head;
		while(p.next!=null)
		{
			p=p.next;
		}
		p.next=new_node;
	
		
	}
		return list;
		}


	public static void print(Linklist list)
	{
		Node p=list.head;
		while(p!=null)
		{
			System.out.println(p.data+ "\t");
			p=p.next;
		}
		System.out.println();
		
	}

	/* Drier program to test above functions */
	public static void main(String args[]) 
	{ 
		Linklist list = new Linklist(); 
		
		list.insert(list,10);
		list.insert(list,20);
		list.insert(list,30);
		list.insert(list,10);
		list.insert(list,40);
		list.insert(list,50);
		list.insert(list,40);
		list.insert(list,40);
	

		
		System.out.println("List before removal of duplicates"); 
		list.print(list); 
		
		removeDuplicate(list);
		System.out.println("List after removal of elements"); 
		list.print(list); 
		printMiddle(list);
	    
	} 
} 

