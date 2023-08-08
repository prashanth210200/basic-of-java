package Java8Example;

public class UseVowel {

	
public static void main(String args[]) {
				String[] names= {"Raj","Saranya","Rishi","YAzhini", "bcd"};
			Vowels v=s-> {
				for(int i=0;i<names.length;i++) {
					if(s[i].contains("a")||s[i].contains("e")||s[i].contains("i")||s[i].contains("o")||s[i].contains("u")) {
						System.out.println(s[i]);
					}
				}
			};
			v.vowels(names);
			System.out.println(v.display());
			System.out.println(Vowels.print());
			
			}
			
}


