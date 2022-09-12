package in.aubank.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {
	public static void main(String[] args) {
		 
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,6));
		
		nums.forEach( (number) -> System.out.println(number) );
		
		System.out.println("------------------------------------");
		
		nums.forEach(System.out::println);
		
		System.out.println("------------------------------------");
		
		List<String> alphabets = new ArrayList<String>(Arrays.asList("a", "b", "c"));
		
		Consumer<String>print = (word) -> System.out.println(word);
		Consumer<String>printUpperCase = (word) -> System.out.println(word.toUpperCase());
		
		alphabets.forEach(print.andThen(printUpperCase));
		
	}
}
