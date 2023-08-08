package StreamAPI;

public class Canditate {
private String name;
private int id;
private int age;
private String qualification;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public Canditate(String name, int id, int age, String qualification) {
	super();
	this.name = name;
	this.id = id;
	this.age = age;
	this.qualification = qualification;
}
@Override
public String toString() {
	return "Canditate [name=" + name + ", id=" + id + ", age=" + age + ", qualification=" + qualification + "]";
}

}
