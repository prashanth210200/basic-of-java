package InterviewQuestins;

import java.util.Arrays;

public class Anagram {
	public static void main(String args[]) {
		String a="Peek".toLowerCase();
		String b="Keep".toLowerCase();
		char a1[]=a.toCharArray();
		char b1[]=b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		Boolean result=Arrays.equals(a1, b1);
		if(result==true) {
			System.out.println("This is Anagram");
		}
		else {
			System.out.println("This is not Anagram");
		}
	}

}
