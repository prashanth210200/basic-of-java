package Exception;

public class NumberForException {

	public static void main(String[] args) {
		String x = args[0];
		try {
			int y = Integer.parseInt(x);
			System.out.println(y);
		} catch (ArithmeticException ae) {
			System.out.println("arithmetic");
			ae.printStackTrace();
		} catch (NullPointerException ne) {
			System.out.println("You are pass the null value");
			ne.printStackTrace();
		} catch (NumberFormatException nf) {
			System.out.println("This is number format Exception");
			nf.printStackTrace();
		} catch (Exception e) {
			System.out.println("common exception ");
			e.printStackTrace();
		} finally {
			System.out.println("Error idendified");
		}
		System.out.println("hi");
	}

}
