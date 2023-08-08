package Exception;

public class Voter {

	public static void main(String[] args) throws AgeException {
		int age=Integer.parseInt(args[0]);
		if(age>18 && age<110) {
			System.out.println("Eligible");
		}
		else {
			throw new AgeException("You are not eligible");
		}

	}

}
