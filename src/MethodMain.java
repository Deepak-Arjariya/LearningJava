
public class MethodMain {
	
	static void play() {
		System.out.println("I am playing");
	}
	
	public static void main(String[] arg) {
		MethodHolder mh = new MethodHolder();
		
		mh.greetMe();
		System.out.println(mh.add(5, 6));
		System.out.println(mh.square(5));
		System.out.println(mh.getGST());
		
		play();
	}
}
