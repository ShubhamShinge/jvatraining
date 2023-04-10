package Threads;

public class YieldingThreadDemo extends Thread
{
	private int countDown = 3;
	private static int threadCount = 0;

	public YieldingThreadDemo()
	{
		//setting thread name.
		super("" + ++threadCount);
    		start();
	}
	public String toString()
	{
		return "#" + getName() + ": " + countDown;
	}
	public void run()
	{
		while (true)
		{
			//this is current object which will call toString() method automatically.
			System.out.println(this);
			if (--countDown == 0)
				return;
		Thread.yield();
		}
  	}
	public static void main(String[] args)
	{
		for (int i = 0; i <3; i++)
			new YieldingThreadDemo();
	}
}
