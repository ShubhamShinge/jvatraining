package Threads;

public class PriorityDemo extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run Called By:"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityDemo p1=new PriorityDemo();
		PriorityDemo p2=new PriorityDemo();
		PriorityDemo p3=new PriorityDemo();
		PriorityDemo p4=new PriorityDemo();
		
		p1.setName("First");
		p2.setName("Second");
		p3.setName("Third");
		p4.setName("Fourth");
		
		p3.setPriority(MAX_PRIORITY);
		p1.setPriority(5);
		p2.setPriority(MIN_PRIORITY);
		p4.setPriority(MIN_PRIORITY);
		
		p3.start();
		p1.start();
		p2.start();
		p4.start();
		System.out.println("Main Called");
	}

}
