package in.aubank.generics;

public class Box {
	Object[] items = new Object[10];
	private int count;
	
	public void add(Object item) {
		items[count++] = item;
	}
	
	public Object get(int index) {
		return items[index];
	}
	
	
}
