package datastructure.queue;

import datastructure.linkedlist.Implimentation.Node;

public class Implimentation<E> {
	
	private Node<E> head,rear;
	
	public void enqueue(E e) {
	
		
		Node<E> toAdd=new Node<E>(e);
		if(head==null) {
			head=rear=toAdd;
			return;
		}
		rear.next=toAdd;
		rear=rear.next;
		
}
	
	public E dequeue() {
		if(head==null) {
			return null;
		}
		if(head==null) {
			rear=null;
		}
		Node<E>temp=head;
		head=head.next;
		return temp.data;
		}
	
	public E peek() {
		if(head==null) {
			return null;
		}
		return head.data;
	}
	public void print() {
		Node<E> temp=head;
		
		while(temp!=null) {
			System.out.print(" "+temp.data+" ");
			
			temp= temp.next;
			
		}
		System.out.println("");
	}

}
