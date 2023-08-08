package StreamAPI;

public class Car {
	private String brand;
	private  int price;
	private int  model;
	private String colour;
	private int cc;
	private String fiel;
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
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getFiel() {
		return fiel;
	}
	public void setFiel(String fiel) {
		this.fiel = fiel;
	}
	public Car(String brand, int price, int model, String colour, int cc, String fiel) {
		super();
		this.brand = brand;
		this.price = price;
		this.model = model;
		this.colour = colour;
		this.cc = cc;
		this.fiel = fiel;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", model=" + model + ", colour=" + colour + ", cc=" + cc
				+ ", fiel=" + fiel + "]";
	}
	
	

}
