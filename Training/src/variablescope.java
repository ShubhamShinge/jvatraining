
public class variablescope {
	int i=10; //instance scope ----> means scopewithin that object
	static int j=20; // class scope ---> means scope for whole class and only one copy per class
	public void inc() {
		//non static method can call both static and non static vaiables i.e. i&j
		i++;
		j++;
	}
	public void display() {
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) {
		variablescope v1=new variablescope();
		v1.inc();
		v1.display();
		variablescope v2=new variablescope();
		v2.inc();
		v2.display();
		
		//static method can only call static vaiables i.e. j (i cannot be called.)
		System.out.println(j);
		System.out.println(v1.j);
		System.out.println(v2.j);
		System.out.println(variablescope.j);
		
				

	}

}
