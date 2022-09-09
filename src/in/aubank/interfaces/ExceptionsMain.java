package in.aubank.interfaces;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsMain {

	public static void main(String[] args){
		int[] num = {1,2,3,4,5};
		
		FileReader fr = null;
	
		try {
			int val = 10 / 1;
			fr = new FileReader("abc.txt");
			int x = num[9];
			
		}
		
		catch (ArithmeticException e) {
			System.out.println("---Arithmentic block exception--");
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			System.out.println("file not found");
//			e.printStackTrace();
		}
//		catch (IOException e) {
//			System.out.println("file not found");
////			e.printStackTrace();
//		}
//		catch (ArithmeticException e) {
//			System.out.println("---Arithmentic block exception--");
//			e.printStackTrace();
//		}
		catch (Exception e) {
			System.out.println("are re re");
//			e.printStackTrace();
		}
		finally {
			System.out.println("ohoooooooooooo");
			
			try {
				fr.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
//			executes when no exception occurs and excevutes when exception occurs
		}
		System.out.println("control reaches here");
 	}
}
