package in.aubank.lambdas;

import java.util.function.Predicate;

public class PredicateMain {
	public static void main(String[] args) {
		
		Predicate<String> lengthGreaterThan5 = word -> word.length() > 5;
		
		boolean result = lengthGreaterThan5.test("Tom");
		
		System.out.println(result);
		
		boolean result1 = lengthGreaterThan5.test("Elizabeth");
		
		System.out.println(result1);
		
		
		Predicate<String> hasLeftCurlyBrace = word -> word.startsWith("{");
		Predicate<String> hasRightCurlyBrace = word -> word.endsWith("}");
		
		Predicate<String> hasBothCurlyBrace = hasLeftCurlyBrace.and(hasRightCurlyBrace);
		
		System.out.println("{M:M} : " + hasBothCurlyBrace.test("{M:M}"));
		
		Predicate<String> negateLength = lengthGreaterThan5.negate();
		
		boolean result2 = negateLength.test("Elizabeth");
		
		System.out.println(result2);
		
		
	}

}
