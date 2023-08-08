package Java8Example;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class HashTableexample {

	public static void main(String[] args) {
		/*Hashtable<Integer,String> ht=new Hashtable<>(10);
		ht.put(101,"Raj");
		ht.put(102,"Rajakannu");
		ht.put(103,"Valarmathi");
		ht.put(104,"Kavitha");
		ht.put(105,"Rajesh");
		ht.put(106,"Siva");
		ht.put(107,"Swathy");
		ht.put(108,"Suruthy");
		ht.put(109,"Sunil");
		ht.put(110,"Rishi");
		ht.put(111,"Rudhran");
		ht.put(112,"Yazhini");
		ht.forEach((s,y)->System.out.println(s.hashCode()%10+" "+y));
		
		*/
		ConcurrentHashMap<Integer,String> ht1=new ConcurrentHashMap<>();
		ht1.put(101,"Raj");
		ht1.put(102,"Rajakannu");
		ht1.put(103,"Valarmathi");
		ht1.put(104,"Kavitha");
		ht1.put(105,"Rajesh");
		ht1.put(106,"Siva");
		ht1.put(107,"Swathy");
		ht1.put(108,"Suruthy");
		ht1.put(109,"Sunil");
		ht1.put(110,"Rishi");
		ht1.put(111,"Rudhran");
		ht1.put(112,"Yazhini");
		for(Entry<Integer, String> name:ht1.entrySet()) {
			ht1.put(113, "Saranya");
			System.out.println(name);
			
		}
		

	}
	
	

}
