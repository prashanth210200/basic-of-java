package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//It is a key value pair
// key is a unique value, it does not allow duplicates and allows only one null key.
// values can be duplicate it allows both null and duplicate values.
// it does not follow insertion order.

public class UseEmploye {

	public static void main(String[] args) {
		String[] x=args[0].split(","); 
		String[] y=args[0].split(","); 
		String[] z=args[0].split(","); 
		
		String a=x[0];
		int b=Integer.parseInt(x[1]);
		boolean c=Boolean.parseBoolean(x[2]);
		
		String a1=y[0];
		int b1=Integer.parseInt(y[1]);
		boolean c1=Boolean.parseBoolean(y[2]);
		
		String a2=z[0];
		int b2=Integer.parseInt(z[1]);
		boolean c2=Boolean.parseBoolean(z[2]);
		
		Employe employe1=new Employe(a,b,c);
		Employe employe2=new Employe(a1,b1,c1);
		Employe employe3=new Employe(a2,b2,c2);

		ArrayList<Employe> employe=new ArrayList<Employe>();
		employe.add(employe1);
		employe.add(employe2);
		employe.add(employe3);
		
		List<Employe> married=employe.stream().filter(s->s.isMarried()==(true)).collect(Collectors.toList());
		married.forEach(w->System.out.println(w));
		
		

	}

}
