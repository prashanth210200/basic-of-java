package StreamAPI;

public class Mobile {
private String brand;
private String colour;
private int price;
private int ram;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public Mobile(String brand, String colour, int price, int ram) {
	super();
	this.brand = brand;
	this.colour = colour;
	this.price = price;
	this.ram = ram;
}
@Override
public String toString() {
	return "Mobile [brand=" + brand + ", colour=" + colour + ", price=" + price + ", ram=" + ram + "]";
}


}
