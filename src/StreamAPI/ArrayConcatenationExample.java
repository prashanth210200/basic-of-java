package StreamAPI;


	import java.util.Arrays;

	public class ArrayConcatenationExample {
	    public static void main(String[] args) {
	        int[] myArray = {3,4,5,9,0,6};
	        StringBuilder stringBuilder = new StringBuilder();

	        for (int element : myArray) {
	            stringBuilder.append(element);
	        }

	        String concatenatedString = stringBuilder.toString();
	        System.out.println(concatenatedString);
	    }
	}



