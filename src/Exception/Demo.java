package Exception;

/*
-> try block is used to find and throw the exception
-> Catch is used to catch and handle the Exception
-> printStackTrace()-It is a methood. It is used to getting an address of the exception class
-> finally() is used to execute the important message whether the exception handled or not.
*/
public class Demo {
	public static void main(String[] args) {
		System.out.println("Hi Exception Handling");
		int x = 50;
		System.out.println(x);
		int  y= 100;
		int z = 0;
		try {
			int p = x / y;
			System.out.println(p);
			int q = x / z;
			System.out.println(q);

		} catch (Exception ae) {
			System.out.println("Dont try to divide anything by zero");
			ae.printStackTrace();
		}
		System.out.println("Exception Handled");
	}

}
