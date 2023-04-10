package CollectionsDemo;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap will give result in sorted order.
		Map <String,Integer> employees=new TreeMap<String,Integer>();
		employees.put("Shubham",100000);
		employees.put("Pratham",150000);
		employees.put("Lokesh",125000);
		System.out.println(employees);
		//this put will affect as Shubham key already exist so it will replace older ones.
		employees.put("Shubham",200000);
		employees.replace("Pratham",175000);
		System.out.println(employees);
		System.out.println(employees.get("Lokesh"));
		
		
	}

}
