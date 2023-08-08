package StreamAPI;

public class Caar {
private String brand;
private String model;
private int price;
private boolean isElectric;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public boolean getIsElectric() {
	return isElectric;
}
public void setIsElectric(boolean isElectric) {
	this.isElectric = isElectric;
}
public Caar(String brand, String model, int price, boolean isElectric) {
	super();
	this.brand = brand;
	this.model = model;
	this.price = price;
	this.isElectric = isElectric;
}
@Override
public String toString() {
	return "Caar [brand=" + brand + ", model=" + model + ", price=" + price + ", isElectric=" + isElectric + "]";
}

}
