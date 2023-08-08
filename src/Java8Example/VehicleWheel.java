package Java8Example;

import java.util.Scanner;

public class VehicleWheel {
	public static void main(String args[]) throws ParkingException{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the wheel number:");
		int wheel=s.nextInt();
		
		if(wheel>1 && wheel<4) {
			System.out.println("Eligible");
		}
		else {
			throw new ParkingException("Heavy Vehicles are not eligible");
		}

	
	}

}
