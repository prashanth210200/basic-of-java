package Java8File;

public class UseStudents {

	public static void main(String[] args) {
		Students s=new Students();
		s.age=20;
		s.name="Raj";
		s.dept="CS";
		s.college="NPV College";
		Students s1=new Students();
		s1.age=22;
		s1.name="Raji";
		s1.dept="BCA";
		Students s2=new Students();
		
		s2.age=25;
		s2.name="Raju";
		s2.dept="CSC";
		s2.college="Jain College";
		
		System.out.println(s1.college);
		
	}

}
