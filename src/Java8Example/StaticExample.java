package Java8Example;

public class StaticExample {

	public static void main(String[] args) {
		StaticExample s1=new StaticExample();
		StaticExample s2=new StaticExample();
		StaticExample s3=new StaticExample();
		System.out.println(StaticExample.display());
		System.out.println(StaticExample.a);
	    System.out.println( s1.display());
		
	}
public static String display() {
	return "Hi";

	}
static int a=5;
static {
	System.out.println("This is static block");
}
public StaticExample() {
	a++;
	System.out.println(a);
}
}
