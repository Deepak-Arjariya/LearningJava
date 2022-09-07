
public class CarMain {
	
	public static void main(String[] val) {
		Car c = new Car();
		Car c2 = c;
				
		c.display();
		c.setup("toyota", "corolla", 1200000);
		c.display();
		c.start();
		c.stop();
		c.radio = new Radio();
		c.radio.play(50);
		c2.radio.volume = 20;
		System.out.println(c2.radio.volume);
		return;
	}
}
