package in.aubank.inheritence;

public class TextBox extends UIControl {
	
	String text;
	
	TextBox(boolean isEnabled){
		super(isEnabled);
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		System.out.println("Dekh jeetu");
		return this.text;
	}
	
	public void cleatText() {
		this.text = "";
	}
	
	public static void enableText() {
		enable();
	}
	
	@Override
	public void render() {
		System.out.println("Textbox printed");
	}
	

}
