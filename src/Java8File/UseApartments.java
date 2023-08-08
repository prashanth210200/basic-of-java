package Java8File;

import Java8File.Apartments.Flats;
//static depends upon the class, not objects.
//static cannot be override
//default can be override

public class UseApartments {

	public static void main(String[] args) {
		Flats f=new Flats();
		System.out.println(f.budget());
		System.out.println(f.isFurnished());
		System.out.println(f.noOfFlats());
		System.out.println(f.builder());
		System.out.println(Apartments.builder());
		System.out.println(Flats.builder());
		

	}

}
