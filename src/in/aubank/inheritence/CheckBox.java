package in.aubank.inheritence;

public class CheckBox extends UIControl {
	
	private boolean checked;
	
	CheckBox(){
		super(false);
	}
	
	public void check() {
		checked = true;
	}
	
	public void uncheck() {
		checked = false;
	}
	
	public boolean checkStatus() {
		return checked;
	}
	
	@Override 
	public void render() {
		System.out.println("Checkbox rendered");
	}
}
