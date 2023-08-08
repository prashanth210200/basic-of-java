package Java8File;

public class UseMaths {

	public static void main(String[] args) {
		Maths add=(a,b)->  a+b;
		System.out.println(add.find(20, 30));
		
		Maths sub=(a,b)->  a-b;
		System.out.println(sub.find(20, 30));
		
		Maths mul=(a,b)->  a*b;
		System.out.println(mul.find(20, 30));
		
		Maths div=(a,b)->  a/b;
		System.out.println(div.find(600, 30));
	}

}
