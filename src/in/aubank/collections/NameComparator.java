package in.aubank.collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Costumer> {

	@Override
	public int compare(Costumer o1, Costumer o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

	
	
}
