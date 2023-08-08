package Java8Example;



public class UseLoginNumberException {

	public static void main(String[] args)throws LoginNumberException {
		String passWord= "RajSaranya";
		
		try {
		if(passWord.length()>6) {
			System.out.println("Login Successfully");
		}
		else {
			throw new LoginNumberException("Character must be above 8");
		}
		}
		catch(LoginNumberException le){
			System.out.println("Enter Valid Password");
		}


	}

}
