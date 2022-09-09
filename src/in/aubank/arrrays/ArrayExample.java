package in.aubank.arrrays;

public class ArrayExample {
	
	public int findMissingelement(int[] array) {
//		int sum = 0;
//		for(int el : array) {
//			sum += el;
//		}
//		
//		return (100 * 101) / 2 - sum; 
		
		boolean[] tempArray = new boolean[array.length];
		for(int i = 0 ; i < 100 ; i++) {
			tempArray[i] = false;
		}
		
		for(int el : array) {
			if(el != 0)
				tempArray[el-1] = true;
		}
		
		for(int i = 0 ; i < 100 ; i++) {
			if(tempArray[i] == false) {
				return i+1;
			}
		}
		return 0;
	}
	
	public boolean checkPalindrome(String word) {
		String temp = word.toLowerCase();
		StringBuffer sb1 = new StringBuffer(temp);
//		StringBuffer sb2 = new StringBuffer(temp);
//		sb2.reverse();
//		
//		boolean flag = true;
//		
//		for(int i = 0 ; i < sb1.length() ; i++) {
//			if(sb1.charAt(i) == sb2.charAt(i)) {
//				continue;
//			}
//			flag = false;
//			break;
//			
//		}
//		
//		return flag;
		
		sb1.reverse();
		String temp2 = sb1.toString();
		
		return temp.equals(temp2);
//		return temp == temp2;
	}
	
	public void printpalindromeWords(String[] words) {
		for(String word : words) {
			boolean flag = checkPalindrome(word);
			
			if(flag)
				System.out.println(word);
			
		}
	}
	
	public void StringLengthClone() {
		String[] words = {"abc", "efgh", "jklmn", "nopqr", "test", "after", "Deepak", "hello", "hi"};
		int[] lengths = new int[words.length];
		
		for(int i = 0 ; i < words.length ; i++) {
			lengths[i] = words[i].length();
		}
		
		for(int val : lengths) {
			System.out.print(val + " ");
		}
		
		return;
		
	}
	
	
}
