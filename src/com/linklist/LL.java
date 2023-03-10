package com.linklist;

public class LL {
	Node head;
	
	class Node{
		
		Object data;
		Node next;
		
		Node (Object data){
			this.data=data;
			this.next=null;
			
		}
	}
		// add first add last 
		public void addfirst (Object data) {
			Node newNode=new Node(data);
			
			if (head == null) {
				head=newNode;
				return;		
			}
			newNode=head;
			head=newNode;			
		}		
	
	//add last 
	public void addlast (Object data) {
		Node newNode=new Node(data);
		
		if (head == null) {
			head=newNode;
			return;		
		}
		Node currentnode=head;
		while(currentnode.next!=null) {
			currentnode=currentnode.next;
		}
		currentnode.next=newNode;
	}
	// print 
	public void print() {
		if (head==null) {
			System.out.println("link list is empty");
			return;
		}
		
		Node currentnode=head;
		while(currentnode!=null) {
			System.out.print(currentnode.data +" -> ");
			
			currentnode=currentnode.next;
		}
		System.out.println("null");
	}
		
	

	public static void main(String[] args) {
	
       
		LL list=new LL();
	
		list.print();
	
	}

}
