package in.aubank.arrrays;

public class ArrayExampleMain {

	public static void main(String[] args) {
		
		int[] array = new int[100];
		
		for(int i = 0 ; i < 100 ; i++) {
			if( i == 5) {
				array[i] = 0;
			}
			else {
				array[i] = i+1;
			}
		}
		
		ArrayExample ae = new ArrayExample();
		
		int missingElement = ae.findMissingelement(array);
		
		System.out.println(missingElement);
		
		
		
		
		String[] words = {"Tom", "Mom", "Bad", "Dad", "Telugu", "Malayalam"};
		
		ae.printpalindromeWords(words);
		
		ae.StringLengthClone();
	}
}
