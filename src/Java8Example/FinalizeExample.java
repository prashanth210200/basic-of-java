package Java8Example;

public class FinalizeExample {
public void finalize() {
	System.out.println("Collected");
}
public static void main(String args[]) {
	FinalizeExample fe=new FinalizeExample();
	System.out.println(fe.hashCode());
	fe=new FinalizeExample();
	System.gc();
}
}
