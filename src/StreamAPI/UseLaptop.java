package StreamAPI;

import java.util.HashMap;
import java.util.Iterator;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop l1=new Laptop("Lenova",20000,"amt",5);
		Laptop l2=new Laptop("Thinkpad",30000,"ast",6);
		Laptop l3=new Laptop("Dell",40000,"art",7);
		Laptop l4=new Laptop("Lenova",50000,"att",8);
		Laptop l5=new Laptop("Dell",60000,"ayt",9);
		Laptop l6=new Laptop("Thinkpad",70000,"ait",4);
		
		HashMap<String,Laptop> lap=new HashMap<>();
		lap.put(l1.getProcessor(),l1);
		lap.put(l2.getProcessor(),l2);
		lap.put(l3.getProcessor(),l3);
		lap.put(l4.getProcessor(),l4);
		lap.put(l5.getProcessor(),l5);
		lap.put(l6.getProcessor(),l6);
		
		Iterator<Laptop> la=lap.values().iterator();
		while(la.hasNext()) {
			if(la.next().getProcessor().equals("amt")) {
				la.remove();
			}
		}
		lap.forEach((x,y)->System.out.println(y));
	}

}
