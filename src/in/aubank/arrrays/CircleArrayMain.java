package in.aubank.arrrays;

public class CircleArrayMain {
	
	public static void main(String[] args) {
		Circle[] array;
		
		array = new Circle[5];
		
		array[0] = new Circle(2);
		Circle c = new Circle(4);
		array[1] = c;
		array[2] = array[0];
		
		for(Circle element : array) {
			if(element != null)
				System.out.println(element.toString());
				System.out.println("Circle with radius: " + element.getRadius());
		}
		
	}
}
