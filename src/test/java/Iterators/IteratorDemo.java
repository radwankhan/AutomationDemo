package Iterators;

import java.util.*;
import java.util.Map.Entry;

public class IteratorDemo {

	public static void main(String[] args) {
		
		System.out.println("*********ArrayList***********");
		ArraylistDemo();
		
		System.out.println("*********HashSet***********");
		HashsetDemo();
		
		System.out.println("*********HashMap Key***********");
		HashmapDemo();
		
		System.out.println("*********HashMap EntrySet***********");
		HashmapEntrySet();
		
		
		


	}

	public static void ArraylistDemo() {
		
		ArrayList<String> mylist = new ArrayList<String>(); // Size is not fixed in arraylist & Size is fixed in array

		mylist.add("Tipu");
		mylist.add("Sabbir");
		mylist.add("Rahim");
		mylist.add("Mina");

		Iterator<String> itr = mylist.iterator();

		while (itr.hasNext()) {
		String str =  itr.next();	
		System.out.println(str);
		}

	}
	public static void HashsetDemo() {
		
		HashSet<String> mylist = new HashSet<String>(); // Size is not fixed in arraylist & Size is fixed in array

		mylist.add("Tipu");
		mylist.add("Sabbir");
		mylist.add("Rahim");
		mylist.add("Mina");

		Iterator<String> itr = mylist.iterator();

		while (itr.hasNext()) {
		String str =  itr.next();	
		System.out.println(str);
		}

	}
	public static void HashmapDemo() {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Tipu");
		hmap.put(2, "Sabbir");
		hmap.put(3, "Rahim");
		hmap.put(4, "Mina");

		Iterator <Integer> itr = hmap.keySet().iterator();

		while (itr.hasNext()) {
		Integer str =  itr.next();	
		System.out.println(str);
		}

	}
public static void HashmapEntrySet() {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Tipu");
		hmap.put(2, "Sabbir");
		hmap.put(3, "Rahim");
		hmap.put(4, "Mina");

		Iterator<Entry <Integer, String>> itr = hmap.entrySet().iterator();

		while (itr.hasNext()) {
		Entry<Integer, String> str =  itr.next();	
		System.out.println(str.getKey() + " = "+str.getValue());
		}

	}
	
}
