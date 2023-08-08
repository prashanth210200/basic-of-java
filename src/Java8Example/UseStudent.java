package Java8Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class UseStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Raj", 25, "Rajakannu", 'A', "Male");
		Student s2 = new Student("Rajakannu", 23, "Poorasamy", 'B', "Male");
		Student s3 = new Student("Valarmathi", 24, "Kanagasabai", 'A', "Female");
		Student s4 = new Student("Yazhini", 11, "Raj", 'B', "Female");
		Student s5 = new Student("Rishi", 15, "Raj", 'c', "Male");

		List<Student> stds = Arrays.asList(s1, s2, s3, s4, s5);
		List<String> concat = stds.stream().filter(s -> s.getGender().equalsIgnoreCase("male"))
				.map(d -> d.getName().concat(d.getFatherName())).toList();
		System.out.println(concat);

		List<String> minName = stds.stream().filter(s -> s.getName().length() <= 4).map(d -> d.getName()).toList();
		System.out.println(minName);
		
		long vote=stds.stream().filter(s->s.getGender().equalsIgnoreCase("male")&&s.getAge()>=18).count();
		System.out.println(vote);
		
		List<String> name=stds.stream().map(s->s.getName()).sorted().toList();
		System.out.println(name);
		
		List<Integer> age=stds.stream().map(s->s.getAge()).sorted(Comparator.reverseOrder()).toList();
		System.out.println(age);
		
		List<Character>cha=stds.stream().map(s->s.getSection()).distinct().toList();
		System.out.println(cha);
		
		List<Student> limit=stds.stream().limit(2).toList();
		System.out.println(limit);
		
		boolean anymatch=stds.stream().anyMatch(d->d.getSection()=='v');
		System.out.println(anymatch);
		
		Student max=stds.stream().max(Comparator.comparing(Student::getAge)).get();	
		System.out.println(max);
		
		int min=stds.stream().min(Comparator.comparing(Student::getAge)).get().getAge();	
		System.out.println(min);
		
		List<Integer> second=stds.stream().map(s->s.getAge()).distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).toList();
		System.out.println(second);
		
		Map<Integer,Student> list=stds.stream().collect(Collectors.toMap(s->s.getAge(), p->p));
		list.forEach((s,p)->System.out.println(s+""+p));
		System.out.println("FlatMap:");
		List<Integer> list1=Arrays.asList(5,10);
		List<Integer> list2=Arrays.asList(15,20);
		List<List<Integer>> x=Arrays.asList(list1,list2);
		List<Integer> result=x.stream().flatMap(a->a.stream()).collect(Collectors.toList());
		result.forEach(b->System.out.println(b));
	} 

	
}
