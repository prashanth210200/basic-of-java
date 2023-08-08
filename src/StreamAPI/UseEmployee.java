package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<Employee>();

		employee.add(new Employee("Raj", 101, 20, 10000, "Male"));
		employee.add(new Employee("Raji", 102, 21, 35000, "Female"));
		employee.add(new Employee("Raja", 103, 22, 30000, "Male"));
		employee.add(new Employee("Rajkumar", 104, 23, 40000, "Male"));
		employee.add(new Employee("Rajesh", 105, 24, 15000, "Male"));
		employee.add(new Employee("Raju", 106, 25, 16000, "Male"));
		employee.add(new Employee("Rajajakannu", 107, 26, 17000, "Male"));
		employee.add(new Employee("Valarmathy", 108, 27, 13000, "Female"));
		employee.add(new Employee("Rishi", 109, 28, 12000, "Male"));
		employee.add(new Employee("Yazhini", 110, 29, 12000, "Female"));

		List<Employee> emp = employee.stream().filter(s -> s.getName().endsWith("i")).collect(Collectors.toList());
		System.out.println(emp);
		Long emp11 = employee.stream().filter(s -> s.getGender().equalsIgnoreCase("Female"))
				.collect(Collectors.counting());
		System.out.println(emp11);

		List<Employee> emp1 = employee.stream().filter(s -> s.getSalary() > 30000 && s.getSalary() < 40000)
				.collect(Collectors.toList());
		System.out.println(emp1);
		Long emp12 = employee.stream().filter(s -> s.getSalary() > 30000).collect(Collectors.counting());
		System.out.println(emp12);

		List<Employee> emp2 = employee.stream().filter(s -> s.getAge() > 25).collect(Collectors.toList());
		System.out.println(emp2);
		Long emp21 = employee.stream().filter(s -> s.getAge() > 25).collect(Collectors.counting());
		System.out.println(emp21);

		List<String> s1 = employee.stream().filter(x -> x.getGender().equalsIgnoreCase("Female")).map(m -> m.getName())
				.collect(Collectors.toList());
		System.out.println(s1);
		List<Character> s = employee.stream().map(j -> j.getName().charAt(2)).collect(Collectors.toList());
		System.out.println(s);
	}

}
