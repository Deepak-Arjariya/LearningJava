package in.aubank.arrrays;

public class ArrayMain {
	
	public static void main(String[] args) {
		int[] iArray;
		
		iArray = new int[5];
		
		int length = iArray.length;
		
		for(int indx = 0 ; indx < length ; indx++) {
			System.out.println(iArray[indx]);
		}
		
		iArray[0] = iArray[1] = iArray[2] = 2;
		iArray[3] = iArray[4] = 3;
		
		System.out.println("--------------------------------");
		
		for(int indx = 0 ; indx < length ; indx++) {
			System.out.println(iArray[indx]);
		}
		
	}
	
}
