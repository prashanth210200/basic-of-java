package Exception;

public class IndexOutException {

	public static void main(String[] args) {
		try {
			String[] arr = new String[10]; 
	        System.out.println(arr[10]);
		}
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic");
			
		}
		catch (NullPointerException ne) {
			System.out.println("null value");
		}
		catch(NumberFormatException nf) {
			System.out.println("number format");
		}
		catch(ArrayIndexOutOfBoundsException aoe) {
			System.out.println("ArrayIndexOutOfBoundsException");
			aoe.printStackTrace();
		}
        catch(Exception e) {
        	System.out.println("Unknown Exception");
        }
		

	}

}
