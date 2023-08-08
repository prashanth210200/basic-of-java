package StreamAPI;

import java.util.HashMap;
import java.util.Iterator;

public class UseMobile {

	public static void main(String[] args) {
		Mobile m1=new Mobile("Samsung","Red",6000,2);
		Mobile m2=new Mobile("Nokia","blue",3000,1);
		Mobile m3=new Mobile("Iphone","White",50000,32);
		Mobile m4=new Mobile("Redmi","gray",16000,4);
		Mobile m5=new Mobile("Redmi6A","Red",10000,3);
		Mobile m6=new Mobile("Samsung11","Yellow",8500,3);
		Mobile m7=new Mobile("Notepad","Block",30000,11);
		
		HashMap<String,Mobile> mobile=new HashMap<>();
		mobile.put(m1.getBrand(), m1);
		mobile.put(m2.getBrand(), m2);
		mobile.put(m3.getBrand(), m3);
		mobile.put(m4.getBrand(), m4);
		mobile.put(m5.getBrand(), m5);
		mobile.put(m6.getBrand(), m6);
		mobile.put(m7.getBrand(), m7);
		
		HashMap<String,Mobile> fastmobile=new HashMap<>();
		HashMap<String,Mobile> avgmobile=new HashMap<>();
		for(Mobile m: mobile.values()) {
			if(m.getRam()>6) {
				fastmobile.put(m.getBrand(), m);
							
			}
			else {
				avgmobile.put(m.getBrand(), m);
	
			}
							
		}
		
		//fastmobile.forEach((x,y)->System.out.println(x+" "+y));
		//avgmobile.forEach((x,y)->System.out.println(x+" "+y));
		
	/*	//ConcurrentModificationException:
	 
	  mobile.forEach((x,y)->{
			if(y.getBrand().equals("Nokia")) {
				mobile.remove(x);
			}
		});*/
	Iterator<Mobile> mo=mobile.values().iterator();
	while(mo.hasNext()) {
		if(mo.next().getBrand().equals("Samsung")) {
			mo.remove();
		}
	}
	mobile.forEach((x,y)->System.out.println(y));
	
	
	
	
	
	}

}
