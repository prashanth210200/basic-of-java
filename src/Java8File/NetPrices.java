package Java8File;

public class NetPrices {

	public static void main(String[] args) {
		
		NetPrice x=(p,t)->p+t;
	    NetPrice y=(p,t)-> p+(p*t/100);
	
	System.out.println(x.findNetPrice(500000, 5000));
	System.out.println(y.findNetPrice(500000, 20));
	}

}
