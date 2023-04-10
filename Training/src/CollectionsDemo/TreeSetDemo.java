package CollectionsDemo;
import java.util.*;
public class TreeSetDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// order is comes in sorted way.
		Set names=new TreeSet();
		names.add("Shubham");
		names.add("Pratham");
		names.add("Lokesh");
		names.add("Mohan");
		names.add("Lavin");
		
		System.out.println(names);
		//performing action using index is not allowed.
		//names.remove(2);
		System.out.println(names);
		
		names.remove("Lavin");
		System.out.println(names);
		
		System.out.println(names.size());
		System.out.println(names.contains("Pratham"));
		//System.out.println(names.get(2));
		System.out.println(names.isEmpty());
		names.clear();
		System.out.println(names.isEmpty());
		
		
	}

}
