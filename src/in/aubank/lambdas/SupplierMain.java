package in.aubank.lambdas;

import java.util.function.Supplier;

public class SupplierMain {
	
	public static void main(String[] args) {
		
		Supplier<Double> getRandom = () -> 1000*Math.random();
		
		double random = getRandom.get();
		
		System.out.println(random);
	}
}
