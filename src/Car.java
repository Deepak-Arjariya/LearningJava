
public class Car {
	
	String company = "";
	String model;
	int price;
//	Radio radio = new Radio();
	Radio radio;
	
	public void start() {
		System.out.println("Wroom Wroom, rooooommmmm_______________");
	}
	
	public void stop() {
		System.out.println("_______daddammmmmmm_________");
	}
	
	public void setup(String company, String model, int price) {
		this.price = price;
		this.company = company;
		this.model = model;
	}
	
	public void display() {
		System.out.println("Company: " + company);
		System.out.println("Model: " + this.model);
		System.out.println("price: ₹" + this.price);
	}
	
	
}
