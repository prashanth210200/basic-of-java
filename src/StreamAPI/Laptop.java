package StreamAPI;

public class Laptop {
private String brand;
private int price;
private String processor;
private int generation;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor = processor;
}
public int getGeneration() {
	return generation;
}
public void setGeneration(int generation) {
	this.generation = generation;
}
public Laptop(String brand, int price, String processor, int generation) {
	super();
	this.brand = brand;
	this.price = price;
	this.processor = processor;
	this.generation = generation;
}
@Override
public String toString() {
	return "Laptop [brand=" + brand + ", price=" + price + ", processor=" + processor + ", generation=" + generation
			+ "]";
}

}
