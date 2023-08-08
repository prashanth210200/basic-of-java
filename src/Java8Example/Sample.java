package Java8Example;
@FunctionalInterface
public interface Sample {
//public void findEven(int[] a);
	
public default String display() {
	return "Even numbers:";
}
public static String print() {
	return " Print Even Numbers";
}
//public void upperCase(String str);
	
public void minLength(String[] str2);
}
