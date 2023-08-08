package Java8Example;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		String[] str = { "Cat", "Dog", "Lion" };
		List<String> al = Arrays.asList(str);
		String[] s = al.toArray(new String[al.size()]);

		for (String st : s) {
			System.out.println(st);
		}
	
System.out.println("-------------------------");
	CopyOnWriteArrayList<String> a=new CopyOnWriteArrayList<>();
	a.add("Saranya");
	a.add("Raj");
	a.add("Rishi");
	a.add("Yazhini");
	for(String v:a) {
		//a.add(50);
		System.out.println(v);
		a.remove("Raj");
		
	}
	System.out.println(a);
	
	
	}
}
