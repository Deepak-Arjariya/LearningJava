package in.aubank.collections;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
	
	public static void main(String[] args) {
		
		Costumer c1 = new Costumer(5, "Tom", "tom@gmail.com", 2348.78F);
		Costumer c2 = new Costumer(2, "pom", "pom@gmail.com", 7348.78F);
		Costumer c3 = new Costumer(8, "zom", "zom@gmail.com", 6348.78F);
		Costumer c4 = new Costumer(4, "rom", "rom@gmail.com", 5348.78F);
		
		Map<String, Costumer> map = new HashMap<String, Costumer>();
		map.put(c1.getEmail(), c1);
		map.put(c2.getEmail(), c2);
		map.put(c3.getEmail(), c3);
		map.put(c4.getEmail(), c4);
		
		System.out.println(map);
		
		boolean exist = map.containsKey("pom@gmail.com");
		
		System.out.println(exist);
		
		Costumer c = map.get("tom@gmail.com");
		
		System.out.println(c);
		
		Costumer c21 = map.get("Tom@gmail.com");
		
		System.out.println(c21);
		
		Costumer defaultCostumer = new Costumer(0,"", "", 0F);
		
		Costumer c22 = map.getOrDefault("Tom@gmail.com", defaultCostumer);
		System.out.println(c22);
		
		map.replace("tom@gmail.com", defaultCostumer);
		
		System.out.println(map);
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		for(Costumer val : map.values()) {
			System.out.println(val);
		}
		
		
		
	}
	
}
