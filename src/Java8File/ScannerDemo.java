package Java8File;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enther name: ");
		String name=in.next();
		System.out.println("Welcome: "+name);
		
	}

}
