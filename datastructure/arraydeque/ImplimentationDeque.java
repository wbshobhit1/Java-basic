package datastructure.arraydeque;


public class ImplimentationDeque<E> {
	
	Node<E> head,tail;
	
	public void addfirst(E data) {
		
		Node<E> toAdd=new Node<E>(data);
		if(head==null) {
			head=tail=toAdd;
		}	
		head.next=toAdd;
		toAdd.prev=head;
		head=toAdd;
		
		
	}
	public void addlast(E data) {
		Node<E> toAdd=new Node<E>(data);
		if(head==null) {
			head=tail=toAdd;
		}	
	 
		head.prev=toAdd;
		toAdd.next=head;
		tail=toAdd;
		
	}
	
	public E removelast() {
		
		Node<E> toRemove=tail;
		if(head==null) {
			return null;
		}
		tail=tail.next;
		tail.prev=null;
		toRemove.next=null;
		
		if(tail==null) {
			head=null;
		}
		
		return toRemove.data;
		
	}
	
	public E removefirst() {
		
		Node<E> toRemove=head;
		if(head==null) {
			return null;
		}
		head=head.prev;
		head.next=null;
		toRemove.prev=null;
		
		return toRemove.data;
}
	
	public void print() {
		Node<E> temp=head;
		Node<E> temp1=tail;
		while(temp1.prev!=null){
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
	}
		
	
	public static class Node<E>{
		 E data;
		public Node<E> next,prev;
		
		public Node(E data){
			this.data=data;
			this.next=this.prev=null;
		}

	}

}
