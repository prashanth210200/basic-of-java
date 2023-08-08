package Java8Example;

import java.util.ArrayList;
import java.util.List;

public class UseNegativeNumber {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<>();
		num.add(-8);
		num.add(8);
		num.add(-20);
		num.add(21);
		num.add(32);
		num.add(-43);
		num.add(44);
		NegativeNumber s=d->{
			for(int i=0;i<num.size();i++) {
				if(num.get(i)<0) {
					System.out.println(num.get(i));
				}
			}
		};
		s.findNagative(num);
		
	}

}
