package datastructure.stacks;

import datastructure.linkedlist.Implimentation;

//USING LINKED LIST WE ARE IMPLIMENTING STACK
public class MyStack<E> {
   
	private Implimentation<E> ll=new Implimentation<>(); 
	
	void push(E e) {
	ll.add(e);	
	
	}
	
	E pop() throws Exception {
	if(ll.isEmpty()) {
		throw new Exception("Poping from empty stack is not allowed");
	}
	return ll.removeLast();
	}
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Peeking in empty stack is not allowed");
		}
		return ll.getLast();
	}
	void print() {
		ll.print();
	}
	
}
