package Java8File;

import java.util.Optional;

public class OptionalPractice {

	public static void main(String[] args) {
		String x=null;
		Optional<String> y=Optional.ofNullable(x);
		/*if(y.isPresent()) {
			System.out.println(x.toUpperCase());
		}
		else {
			System.out.println("The value is null");
			
		}*/
		System.out.println(y.orElse("The value is null"));
		
		
	}

}
