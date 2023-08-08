package Exception;

public class NullPointException {

	public static void main(String[] args) {

		String x = null;
		try {
			String y = x.toUpperCase();
			System.out.println(y);
		} catch (ArithmeticException ae) {
			System.out.println("Arithimetic");
		} catch (NullPointerException ne) {
			System.out.println("Null value");
		} catch (Exception e) {
			System.out.println("Anything");
		}

	}

}
