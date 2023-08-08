package InterviewQuestins;

import java.util.HashMap;

public class StringNumberCount {
    public static void main(String[] args) {
        String a = "a3b2c8";
        for(int i=0;i<a.length();i++) {
        	if(Character.isAlphabetic(a.charAt(i))) {
        		System.out.print(a.charAt(i));
        	}
        	
        	else {
        		int num=Character.getNumericValue(a.charAt(i));
        		for(int j=1;j<num;j++) {
        			System.out.print(a.charAt(i-1));
        		}
        	}
        }
        
        
        System.out.println("Hi");
        String b="aaabbbccccc";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<b.length();i++) {
        	char ch=b.charAt(i);
        	if(map.containsKey(ch)) {
        		int count=map.get(ch);
        		count++;
        		map.replace(ch, count);
        	}
        	else {
        		map.put(ch, 1);
        	}
        }
        for(Character key:map.keySet()) {
        	
        	System.out.print(key+""+map.get(key));
        }
    }
}

