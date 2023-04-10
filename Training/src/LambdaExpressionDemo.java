interface MathOperation{
	int operation();
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defining method using lambda expression note: Interface should be functional interface
		//Functional Interface is nothing but interface having only one method i.e. Runnable,Mathoperation,Comparable,Comparator;
		//<Interface> objectname = (input parameters) -> return block;
		MathOperation m1=()->7;
		System.out.println(m1.operation());
		
		Runnable r=()->System.out.println("Run Method Called -"+Thread.currentThread().getName());
		Thread t1=new Thread(r);
		t1.start();
		
		//another way...without creating object.
		Thread t2=new Thread(()->System.out.println("Run Method Called -"+Thread.currentThread().getName()));
		t2.start();
	}

}
