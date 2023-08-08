package Java8Example;

public class StringExample {
public static void main(String args[]) {
	String str="Raj";
	String str1=new String("Raj");
	StringBuffer sb=new StringBuffer("Raj");
	StringBuilder sb1=new StringBuilder("Raj");
	System.out.println(str.hashCode());
	System.out.println(str1.hashCode());
	System.out.println(sb.hashCode());
	System.out.println(sb1.hashCode());
	System.out.println(str.concat(str1));
	
	
	String re="";
	for(int i=str.length()-1;i>=0;i--) {
		re=re+str.charAt(i);
		
	}
	System.out.println(re);
	
}
}
