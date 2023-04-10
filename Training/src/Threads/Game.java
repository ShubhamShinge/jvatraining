package Threads;

public class Game extends Thread {
	//Thread t1;
	public Game() {
		Thread t1=new Thread(this);
		t1.start();
		System.out.println("Thread Started-"+Thread.currentThread().getName());
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run Called-"+Thread.currentThread().getName());
		for(int i=0;i<5;i++)
			System.out.println("Shubham Shinge");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g=new Game();
		//g.start();
		System.out.println("Main Called By-"+Thread.currentThread().getName());
	}

}
