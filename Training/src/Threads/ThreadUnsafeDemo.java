package Threads;
//Not synchronized so thread unsafe to make safe use synchronized keyword
class TwoStrings
{
	static  void print(String str1, String str2)
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
class PrintStringsThread implements Runnable
{
	Thread thread;
	String str1, str2;
	PrintStringsThread(String str1, String str2)
	{
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this);
		thread.start();
	}
	public void run()
	{
		TwoStrings.print(str1, str2);
	}
}
public class ThreadUnsafeDemo
{
	public static void main(String args[])
	{
		new PrintStringsThread("Hi", "Tufail");
		new PrintStringsThread("Hi", "Prashant");
		new PrintStringsThread("Hi","Neha");
	}
}