package Java8Example;

import java.util.Objects;

public class Employee {
private String name;
private int age;
private String gender;
private int id;
private int salary;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Employee(String name, int age, String gender, int id, int salary) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.id = id;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", id=" + id + ", salary=" + salary + "]";
}
@Override
public int hashCode() {
	return Objects.hash(name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(name, other.name);
}



}
