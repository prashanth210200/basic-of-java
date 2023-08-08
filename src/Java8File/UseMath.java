package Java8File;

public class UseMath {

	public static void main(String[] args) {
		int[] num= {10,20,30,40};
		Arithmetic a=new Arithmetic();
		Math max=a::findMax;
		System.out.println(max.find(num));
		Math min=a::findMin;
		System.out.println(min.find(num));
	}

}
