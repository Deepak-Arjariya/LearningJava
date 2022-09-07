
public class Circle {
	
	int radius;
	
	Circle(int radius){
		setRadius(radius);
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double circumference() {
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
}
