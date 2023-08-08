package Java8Example;

import Java8File.Arithmetic;


public class UseSample {

	public static void main(String[] args) {
		//int[] nums= {5, 20, 34, 51,57};
		Arithmetic a=new Arithmetic();
		//Sample even=a::findEven;
		//even.findEven(nums);
		//Sample str=a::upperCase;
		//str.upperCase("raj");
		
		String[] str1= {"Raj","Ramu","Siva","Kavitha"};
		
		Sample str2=a::minLength;
		str2.minLength(str1);


	}

}
