package Exception;

public class StringClass {
	/*
	 * == compare the memory of the String
       .equal() method compare values of String

	 * 
	 */

	public static void main(String[] args) {
		StringBuilder builder1 = new StringBuilder("ABC");
		StringBuilder builder2= new StringBuilder("ABC");
		
		System.out.println(builder1.hashCode());
		System.out.println(builder2.hashCode());
		
		System.out.println(builder1== builder2) ;
		System.out.println(builder1.equals(builder2));// it will check the object
		
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1 == s2 );
		System.out.println(s1.equals(s2));

	}

}
