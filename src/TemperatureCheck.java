
public class TemperatureCheck {
	public static void main(String[] args) {
		String role = "Testere";
		String password;
		
		switch(role) {
		case "Developer":
			password = "ABC@123";
			break;
		case "Tester":
			password = "TYU@123";
			break;
		default:
			password = "OutOfNetwork";	
		}
		
		System.out.println(password);
	
		int i = 20;
		do {
			System.out.println(i);
		}
		while(i++ < 25);
	}
}
