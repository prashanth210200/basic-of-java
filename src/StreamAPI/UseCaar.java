package StreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UseCaar {

	public static void main(String[] args) {
		Caar c1=new Caar("AUDI","S1",100000,true);
		Caar c2=new Caar("BMW","S2",200000,false);
		Caar c3=new Caar("JACUWAR","S3",300000,true);
		Caar c4=new Caar("TATA","S5",400000,false);
		Caar c5=new Caar("BENZ","S4",500000,true);
		ArrayList<Caar> car1=new ArrayList<Caar>();
		car1.add(c1);
		car1.add(c2);
		car1.add(c3);
		car1.add(c4);
		car1.add(c5);
		
	    List<Caar> s2=car1.stream().filter(s->s.getIsElectric()==true).collect(Collectors.toList());
	    s2.forEach(x-> System.out.println(x.getPrice()-10000));
		
		//List<Caar>s3=car1.stream().map(null)-print seat numbers,convert lowercase and print colour only
		
		HashMap<String,Caar> caar=new HashMap<>();		
		caar.put(c1.getModel(), c1);
		caar.put(c2.getModel(), c2);
		caar.put(c3.getModel(), c3);
		caar.put(c4.getModel(), c4);
		caar.put(c5.getModel(), c5);
		
		
		
		
		HashMap<String,Caar> caarElectric=new HashMap<>();
		HashMap<String,Caar> caarPetrol=new HashMap<>();
		for(Caar c: caar.values()) {
			if(c.getIsElectric()==true) {
				caarElectric.put(c.getModel(), c);
				System.out.println(caarElectric);
				
			}
			else {
				caarPetrol.put(c.getModel(), c);
				System.out.println(caarPetrol);
			}
							
		}
		
		caar.forEach((x,y)->{
			if(y.getIsElectric()==true) {
				caarElectric.put(x, y);
			}
		});
		caarElectric.forEach((x,y)->System.out.println(x+" "+y));
		
	}

}
