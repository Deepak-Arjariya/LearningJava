package in.aubank.inheritence;

public class UiMain {
	
	public static void main(String[] args) {
		TextBox textBox = new TextBox(false);
		
		UIControl control = new TextBox(true);
		
		System.out.println(textBox.isEnabled());
		
		textBox.enableText();
		System.out.println(textBox.isEnabled());
		
		
		
		textBox.render();
		
		textBox.disable();
		System.out.println(textBox.isEnabled());
		
		System.out.println(textBox.getText());
		
		textBox.setText("Radhe");
		System.out.println(textBox.getText());
		
		if(textBox instanceof TextBox) {
			System.out.println("You got it right");
		}
		
		ImageBox image = new ImageBox();
		
		
		
		image.render();
		
//		if(!(textBox instanceof CheckBox)) {
//			System.out.println("You are wrong");
//		}
		
//		control.getText();  not available
		
//		TextBox textbox = (TextBox) new UIControl(false);
//		
//		textbox.setText("randomText");
//		
//		System.out.println(textbox.getText());
//		
//		
//		Object test = new Object();
//		
//		System.out.println(test.equals(textBox));
		
		
		
		
	}
}
