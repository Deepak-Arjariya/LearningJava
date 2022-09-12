package in.aubank.generics;

public class Main {
	
	public static void main(String[] args) {
		
		Box intBox = new Box();
		
		intBox.add(19);
		intBox.add(20);
		intBox.add(30);
		intBox.add("Au Bank");
		
		Integer tempVar = (Integer)intBox.get(0);
		
		System.out.println(tempVar);
		
//		Integer i3 = (Integer)intBox.get(3);
//		System.out.println(i3);
		
		String i31 = (String)intBox.get(3);
		System.out.println(i31);
		
//		--------------------------------------------------------------------------------------------------------------------
		
		MyBox<Integer> myIntBox = new MyBox<>();
		
		myIntBox.add(3);
		System.out.println(myIntBox.get(0));
		
		MyBox<Circle> myCircleBox = new MyBox<Circle>();
		Circle value = new Circle(4);
		
		myCircleBox.add(value);
		
		System.out.println(myCircleBox.get(0).toString());
		System.out.println(myCircleBox.get(0));
				
				
		
	}
}
