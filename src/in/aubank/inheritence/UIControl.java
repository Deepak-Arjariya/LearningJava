package in.aubank.inheritence;

public abstract class UIControl {
	
	private static boolean isEnabled;
	
	UIControl(boolean isEnabled){
		UIControl.isEnabled = isEnabled;
	}
	
	public static void enable() {
		isEnabled = true;
	}
	
	public void disable() {
		isEnabled = false;
	}
	
	public boolean isEnabled() {
		return isEnabled;
	}
	
	public abstract void render();
}
