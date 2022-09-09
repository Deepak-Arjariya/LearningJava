package in.aubank.inheritence;

public  abstract class B extends A {
	
	public abstract void implement(); 
	
	int y = 10;
	B(int value){
		System.out.println("B - (" + value + ")");
	}
}
