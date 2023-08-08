package StreamAPI;

import java.util.HashMap;

public class ExampleHashMap {

	public static void main(String[] args) {
		String emp1="Raja";
		String emp2="Raji";
		String emp3="Rajadurai";
		String emp4="Durairaj";
		HashMap<Integer,String> employees=new HashMap<>();
		employees.put(101, emp1);
		employees.put(102, emp2);
		employees.put(103, emp3);
		employees.put(103, emp4);
		
		System.out.println(employees.get(103));
		System.out.println(employees.keySet());
		System.out.println(employees.values());
		for(Integer i: employees.keySet()) {
			System.out.println(i+" "+employees.get(i));
		}
		
		for(String s:employees.values()) {
			System.out.println(s);
		}
		
		employees.keySet().forEach(x->System.out.println(x+" "+employees.get(x)));
		employees.values().forEach(y->System.out.println(y));
		employees.forEach((a,b)->System.out.println(a+" "+b));
		
		
		
		
	}
	
}
