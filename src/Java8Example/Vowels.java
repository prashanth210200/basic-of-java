package Java8Example;

@FunctionalInterface
public interface Vowels {
	public void vowels(String[] a );
	public default String display() {
		return "Welcome";
	}
	
	public static String print() {
		return "Vowels";
	}
}
	 