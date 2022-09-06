import java.util.Scanner;

public class TerminalBehaviour {

	public static void main(String[] args) {
			
			
		Scanner sc = new Scanner(System.in);
		String input = "";
		
		while(true) {
			
			System.out.print("Input the command: ");
			input = sc.nextLine();
			if(input.equals("exit")) {
				break;
			}
			if(input.equals("pass")) {
				continue;
			}
			
			System.out.println(input);
			
		}
		
		System.out.println("-----------------We are Exiting--------------------------");
		}
}
