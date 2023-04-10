import java.util.*;
public class CustomDatatypeIteratorDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<Product> is generics means our list will only take input type of Class Product which we created in Product.java
		List<Product> products=new ArrayList<Product>();
		Product p1=new Product(101,"Amway",12,199);
		Product p2=new Product(273,"Ikea",65,866);
		Product p3=new Product(784,"Parle",30,54);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(new Product(104,"Lays",300,30));
		System.out.println(products);
		System.out.println(products.contains(p1));
		//Usingcomparable
		Collections.sort(products);
		Iterator<Product> i=products.iterator();
		
		while(i.hasNext()) {
			Product temp=i.next();
			System.out.println(temp);
		}
		
		System.out.println("-----------");
		
		//Using Comparator Interface and creating class for comparison
		Collections.sort(products,new ProductPriceCompareDesc());
		Iterator<Product> i1=products.iterator();
		
		while(i1.hasNext()) {
			Product temp=i1.next();
			System.out.println(temp);
		}
		
		System.out.println("-----------");
		
		//Using Comparator Interface and creating class for comparison
		Collections.sort(products,new ProductIDCompare());
		Iterator<Product> i2=products.iterator();
		
		while(i2.hasNext()) {
			Product temp=i2.next();
			System.out.println(temp);
		}
		System.out.println("--------Comparator method using lambda expression");
		
		Comparator<Product> comparePrice=(o1,o2)->{if(o1.getPrice()>o2.getPrice())return 0;else return -1;};
		Collections.sort(products,comparePrice);
		Iterator<Product> i4=products.iterator();
		
		while(i4.hasNext()) {
			Product temp=i4.next();
			System.out.println(temp);
		}
	}

}
