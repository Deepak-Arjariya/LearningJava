package in.aubank.lambdas;

public class TestLambda {

	public void display() {
		System.out.println("Hello");
	}
	
	
//	() -> System.out.println("Hello");
	
	public int square(int num) {
		return num * num;
	}
	
//	num -> num*num;
	
	public void add(int a , int b) {
		System.out.println(a+b);
	}
	
//	(int a, int b) -> System.out.println(a + b);
	
	public int calculation(int a, int b, int c) {
		int d = a + b;
		int e = d + c;
		int f = d * e;
		return f;
	}
	
//	 (int a , int b , int c) -> {
//		int d = a + b;
//		int e = d + c;
//		int f = d * e;
//		return f;
//	}
