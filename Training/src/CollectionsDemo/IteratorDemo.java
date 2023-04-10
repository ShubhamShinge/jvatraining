package CollectionsDemo;
import java.util.*;
public class IteratorDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<String> is generics means our list will only take input type String.
		List<String> names=new ArrayList<String>();
		names.add("Shubham");
		names.add("Pratham");
		names.add("Lokesh");
		names.add("Mohan");
		names.add("Lavin");
		
		System.out.println(names);
		
		
		Iterator<String> i=names.iterator();
		
		while(i.hasNext()) {
			String temp=i.next();
			System.out.println(temp);
		}
		
		
	}

}
