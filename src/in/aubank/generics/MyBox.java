package in.aubank.generics;

public class MyBox<T> {
	private int count;
	T[] items = (T[]) new Object[10];
	
	public void add(T item) {
		items[count++] = (item);
	}
	
	public T get(int index) {
		return items[index];
	}
	
}
