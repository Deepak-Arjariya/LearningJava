package in.aubank.inheritence;

import java.util.Objects;

public class Point {

	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object otherObject) {
		
		if(this == otherObject) {
			return false;
		}
		
		if(!(otherObject instanceof Point))
			return false;
		
		Point other = (Point) otherObject;
		
		
		return (other.x == this.x) && (this.y == other.y);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.x, this.y);
	}
	
	@Override
	public String toString() {
		String representation = " point x: " + this.x + " Point y: " + this.y + " at address " + this.hashCode();
		return representation;
	}
}
