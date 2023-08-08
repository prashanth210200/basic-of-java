package InterviewQuestins;

public class Pangram {

	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz".toLowerCase();
		System.out.println(isPangram(s));

	}

	private static boolean isPangram(String s) {
		if(s.length()<26) {
			return false;
		} else {
			for(char ch='a';ch<='z';ch++) {
				if(s.indexOf(ch)>0) {
					return true;
				}
			}
		} return false;
		
		
		
		
	}

}
