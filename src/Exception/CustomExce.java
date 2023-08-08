package Exception;
/*-> throw is used within a block and throw the exception and it might be single
  -> throws is used beside the  method signature. it may be multiple.it con't throw the exception.
*/
public class CustomExce {

	public static void main(String[] args)throws LoginException {
		String u=args[0];
		String p=args[1];
		try {
		if(u.equals("Raj")&&p.equals("Saranya")) {
			System.out.println("Valid password");
		}
		else {
			throw new LoginException("Invalid password");
		}
		}
		catch(LoginException le){
			System.out.println("your password is invalid");
		}

	}

}
