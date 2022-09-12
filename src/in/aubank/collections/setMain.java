package in.aubank.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class setMain {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("fZ");
		
		Set<String> set1 = new HashSet<>();
		
		set1.add("v");
		set1.add("q");
		set1.add("l");
		set1.add("d");
		set1.add("fZ");
		
//		boolean unionedSet = set.addAll(set1);
		
		set1.retainAll(set);
		
		System.out.println(set1);
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			String element = itr.next();
			System.out.println(element);
		}
		
		String[] codes = {"MUM", "JAI", "MAA", "MUM", "BLR"};
		List<String> codes1 = Arrays.asList(codes);
		
		
		
		Set<String> setCodes = new HashSet<>(codes1);
		Set<String> setCodes1 = new LinkedHashSet<>(codes1);
		Set<String> setCodes2 = new TreeSet<>(codes1);
		
		System.out.println(setCodes);
		System.out.println(setCodes1);
		System.out.println(setCodes2);
		
	}
}
