
public class CheckTheNumber {
	public static void main(String[] args) {
		boolean hasComputer = true;
		boolean hasWifi = false;
		
		String output = "can do work from home";
		if(!hasComputer || !hasWifi){
			output = "cannot do work from home";
		}
		
		System.out.println(output);
	}
}
