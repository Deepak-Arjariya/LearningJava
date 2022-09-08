package in.aubank.inheritence;

public class Main {

	public static void main(String[] args) {
		LuvKush child = new LuvKush();
		child.challange();
		child.showLove();
		
		Father father = new Father();
		
		System.out.println(father.hashCode());
		
		System.out.println(child.name);
		System.out.println(child.getClass().getSuperclass());
		System.out.println(father.getClass().getSuperclass().getName());
		
//		----------------------------------
		
		Point point1 = new Point(10,20);
		Point point2 = new Point(10,20);
		
		System.out.println(point1 == point2);
		System.out.println(point1.equals(point2));
		System.out.println(point1.equals(father));
		System.out.println(point1.equals(point1));
		
//		also modified hashCode function
		System.out.println(point1.hashCode());
		System.out.println(point2.hashCode());
		
		System.out.println(point1.toString());
		System.out.println(point2.toString());
		
		
	}
}
