package StreamAPI;

public class Employe {
private String name;
private int age;
private boolean isMarried;
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
public boolean isMarried() {
	return isMarried;
}
public void setMarried(boolean isMarried) {
	this.isMarried = isMarried;
}
public Employe(String name, int age, boolean isMarried) {
	super();
	this.name = name;
	this.age = age;
	this.isMarried = isMarried;
}
@Override
public String toString() {
	return "Employe [name=" + name + ", age=" + age + ", isMarried=" + isMarried + "]";
}


}
