package in.aubank.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UtilityMain {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("k", "b", "l", "d"));
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Set<Integer> num = new TreeSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,4,6,4,3,9,0));
		
		System.out.println(Collections.max(num));
		System.out.println(Collections.min(num));
		
		Costumer c1 = new Costumer(5, "Tom", "tom@gmail.com", 2348.78F);
		Costumer c2 = new Costumer(2, "pom", "pom@gmail.com", 7348.78F);
		Costumer c3 = new Costumer(8, "zom", "zom@gmail.com", 6348.78F);
		Costumer c4 = new Costumer(4, "rom", "rom@gmail.com", 5348.78F);
		
		List<Costumer> costumers = new ArrayList<>();
		
		costumers.add(c1);
		costumers.add(c2);
		costumers.add(c3);
		costumers.add(c4);
		
		System.out.println(costumers);
		
//		public static void printCostumer(List<Costumer> list1) {
//			for(Costumer cs : list1) {
//				System.out.println(cs);
//			}
//		}
		
		
		Collections.sort(costumers);
		System.out.println(costumers);
		
		printCostumer(costumers);
		
		Collections.sort(costumers, new NameComparator());
		System.out.println(costumers);
		
		
		Collections.sort(costumers, 
				(o1 , o2) -> (int)(o1.getBalance() - o2.getBalance())
		);
		System.out.println(costumers);
		
		printCostumer(costumers);
		
	}
	
		public static void printCostumer(List<Costumer> list1) {
			
			System.out.println("\n------------Start-------------\n");
			
			for(Costumer cs : list1) {
				System.out.println(cs);
			}
			
			System.out.println("\n------------End--------------\n");
		}
}
