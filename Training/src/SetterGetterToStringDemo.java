
public class SetterGetterToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1;
		Product p2;
		try {
			p1 = new Product(101,"Aroma",32,999);
			p1.setPrice(-567);
			p2 = new Product(102,"Amway",-50,500);
		} catch (NegativePriceException e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}
		catch (NegativeQOHException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		//p1.setPrice(899);
		//p1 will automatically call toString method.
		//toString method is overrided method from parent class:Object.
		//System.out.println(p1);
		
		
		 
		//System.out.println(p2);
		
		Product p3=new Product(103,"Britania",87,200);
		p3.setProductName("GoodDay");
		System.out.println(p3);
		
		Customer1 c1=new Customer1(123,"Shubham",3000);
		System.out.println("Thanks for using my program");
	}

}
