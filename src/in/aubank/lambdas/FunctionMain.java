package in.aubank.lambdas;

import java.util.function.Function;

public class FunctionMain {
	public static void main(String[] args) {
		Function<String, Integer> map = word -> word.length();
		
		int l = map.apply("Seven");
		
		System.out.println(l);
		
		Function<String, String> replaceEquals = input -> input.replace("=",":");
		
		String check = replaceEquals.apply("Ram = Sita");
		System.out.println(check);
		
		Function<String, String> addCurlyBrace = input -> "{" + input + "}";
		System.out.println(addCurlyBrace.apply(check));
		
		String output = replaceEquals.andThen(addCurlyBrace).apply("MP = Harpalpur");
		System.out.println(output);
		
		
	}
}
