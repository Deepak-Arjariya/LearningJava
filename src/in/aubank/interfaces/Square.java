package in.aubank.interfaces;

public class Square {
	int length;
	
	public void setLength(int length) throws Exception {
		if(length > 0)
			this.length = length;
		else
			throw new SquareException("length should be greater than zero");
	}
	
	public void area() {
		int area = length * length;
		System.out.println("Area: " + area);
	}
}
