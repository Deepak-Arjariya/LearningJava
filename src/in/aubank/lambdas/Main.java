package in.aubank.lambdas;

public class Main {
	
	public static void show() {
		
		
//		Traditional way
		Printer p = new ConsolePrinter();
		greet(p);
		
		
//		Anonymous  function
		greet(new Printer() {
			
			public void print(String message) {
				System.out.println(message.toUpperCase());
			}
		});
		
		
//		Lambda function
		greet( 
				(String message) -> {
					System.out.println(message.toLowerCase());
					}
				
				);
		
		
		greet( 
				(message) -> {
					System.out.println(message.toLowerCase());
					}
				
				);
		
		
		
//		for single parameter we can skip the parenthesis
		greet( 
				message -> {
					System.out.println(message.toLowerCase());
					}
				
				);
		
		greet( message -> System.out.println(message.toLowerCase()) );
		
		Printer printer = message -> System.out.println("Hello");
		
		greet(System.out::println);
		
//		printer = new ConsolePrinter();
		
	}
	
	public static void greet(Printer printer) {
		printer.print("Hello Welcome again to Java Programming!");
	}
	
	public static void main(String[] args) {
		show();
	}
}
