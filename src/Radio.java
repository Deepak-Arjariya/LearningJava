
public class Radio {
	
	int volume;
	
	public void play(int volume) {
		this.volume = volume;
		System.out.println("The radio is playing at volume: " + this.volume);
	}
}
