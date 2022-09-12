package in.aubank.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class IterableMain {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("one"); 
		list.add("two");
		list.add("three");
		
		for(String str : list) {
			System.out.println(str);
		}
		
//		ArrayList<String> test = new ArrayList<>();
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.println(element.toUpperCase());
		}
		
		
		
//		---------------------------------------------------------Collection---------------------------------------------------------------
		
		Collection<String> collection = new ArrayList<String>();
		
		collection.add("A");
		collection.add("B");
		collection.add("C");
		
		System.out.println(collection);
		
		Collections.addAll(collection, "e", "f", "g");
		
		System.out.println(collection);
		
		int size = collection.size();
		
		System.out.println("======Size of Collection======== " + size);
		
		collection.remove("C");
		System.out.println(collection);
		
		collection.clear();
		
		System.out.println(collection.isEmpty());
		
		Object[] objectArray = collection.toArray();
		
		String[] stringArray = collection.toArray(new String[0]);
		
		collection = new ArrayList<String>();
		
		collection.add("A");
		collection.add("B");
		collection.add("C");
		
		Collection<String> other = new ArrayList<String>();
		
		other.add("A");
		other.add("B");
		other.add("C");
		
		System.out.println(collection == other);
		System.out.println(collection.equals(other));
		
		System.out.println(objectArray);
		System.out.println(stringArray);
		
		List<String> list1 =  new ArrayList<String>();
		
		list1.add("one"); 
		list1.add("two");
		list1.add("three");
		
		System.out.println(list1);
		
		list1.add(0,"true");
		
		System.out.println(list1);
		
//		list1.add("s", "f");
		Collections.addAll(list1,"a","b","c","a");
		System.out.println(list1);
		
		String el = list1.get(0);
		list1.set(2, ",");
		System.out.println(list1);
		
		list1.remove(0);
		System.out.println(list1);
		
		int firstIndex = list1.indexOf("a");
		
		int lastIndex = list1.lastIndexOf("a");
		
		System.out.println(el);
		
		System.out.println(firstIndex);
		
		System.out.println(lastIndex);
		
		
		
		
		
		
		
		
		
	
	}

}
