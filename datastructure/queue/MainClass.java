package datastructure.queue;

public class MainClass {

	public static void main(String[] args) {
		 Implimentation<Integer> mq=new Implimentation<>();
		 
		 mq.enqueue(87);
		 mq.enqueue(45);
		 mq.enqueue(7);
		 mq.enqueue(12);
		 
	
		mq.enqueue(111);
		mq.print();
		
        System.out.println(mq.dequeue());
        mq.print();
        System.out.println(mq.peek());
	}

}
