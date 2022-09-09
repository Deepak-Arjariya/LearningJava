package in.aubank.arrrays;

public class Circle extends Object{
	
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString(Circle this){
		return "The circle has radius " + this.radius;
	}
	
	
}
