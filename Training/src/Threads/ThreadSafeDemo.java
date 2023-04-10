package Threads;
class TwoStrings1
{
	static synchronized void print(String str1, String str2)
	{
		System.out.print(str1);
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ie)
		{
		}
		System.out.println(str2);
	}
}
class PrintStringsThread1 implements Runnable
{
	Thread thread;
	String str1, str2;
	PrintStringsThread1(String str1, String str2)
	{
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this);
		thread.start();
	}
	public void run()
	{
		TwoStrings1.print(str1, str2);
	}
}
public class ThreadSafeDemo
{
	public static void main(String args[])
	{
		new PrintStringsThread1("Hi", "Tufail");
		new PrintStringsThread1("Hi", "Prashant");
		new PrintStringsThread1("Hi","Neha");
	}
}