package StreamAPI;

import java.util.HashMap;

public class UseCanditate {

	public static void main(String[] args) {
		Canditate c1=new Canditate("Raj",101,21,"Bca");
		Canditate c2=new Canditate("Raju",102,31,"cs");
		Canditate c3=new Canditate("RajSiva",103,23,"IT");
		Canditate c4=new Canditate("Saranya",104,22,"cs");
		Canditate c5=new Canditate("RajDurai",105,26,"Bca");
		Canditate c6=new Canditate("Rajesh",106,21,"ca");
		Canditate c8=new Canditate("Raji",107,21,"cs");
		Canditate c9=new Canditate("Rajkumar",108,21,"Bca");
		Canditate c7=new Canditate("Rajeshwari",109,29,"Bca");
		Canditate c10=new Canditate("Raj",110,23,"IT");
		
		HashMap<Integer,Canditate> canditates=new HashMap<>();
		canditates.put(c1.getId(), c1);
		canditates.put(c2.getId(), c2);
		canditates.put(c3.getId(), c3);
		canditates.put(c4.getId(), c4);
		canditates.put(c5.getId(), c5);
		canditates.put(c6.getId(), c6);
		canditates.put(c7.getId(), c7);
		canditates.put(c8.getId(), c8);
		canditates.put(c9.getId(), c9);
		canditates.put(c10.getId(), c10);
		canditates.forEach((x,y)->System.out.println(x+" "+y));
		
		for(Canditate c: canditates.values()) {
			System.out.println(c);
		}
		
		
	}

}
