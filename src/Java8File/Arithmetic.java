package Java8File;

public class Arithmetic {
	
	public int findMax(int[] num ) {
		int max=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		
		return max;
	}
	
	public int findMin(int[] num ) {
		int min=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		
		return min;
	}
	
	public void findEven(int[] num) {
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
		
	}
	
	public void upperCase(String str) {
		System.out.println(str.toUpperCase());
	}
	
	
	public void minLength(String[] str1) {
		String min=str1[0];
		for(int i=0;i<str1.length;i++) {
			if(str1.length<min.length()) {
				min=str1[i];
			}
		}
	
	System.out.println(min);
	
	}
	
	
}
