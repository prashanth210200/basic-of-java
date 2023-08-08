package Java8Example;

import java.util.HashMap;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee("Raj",30,"Male",101,35000);
		Employee e2=new Employee("Rajajakannu",60,"Male",102,60000);
		Employee e3=new Employee("Valarmathi",50,"Female",103,31000);
		Employee e4=new Employee("Saranya",20,"Female",104,20000);
		Employee e5=new Employee("Rishi",30,"Male",101,35000);
		
		HashMap<Integer,Employee> hm=new HashMap<>();
		hm.put(e1.getId(), e1);
		hm.put(e2.getId(), e2);
		hm.put(e3.getId(), e3);
		hm.put(e4.getId(), e4);
		hm.put(e5.getId(), e5);
		hm.forEach((x,y)->System.out.println(x+" "+y));
		System.out.println(e1.hashCode());
		System.out.println(e4.hashCode());
		
		hm.put(e1.getId(), e1);
		hm.put(e5.getId(), e5);
		hm.forEach((a,b)->System.out.println(a+" "+b));
		
		System.out.println(e1.hashCode());
		System.out.println(e5.hashCode());
		System.out.println(e1.equals(e5));
		

	}

}
