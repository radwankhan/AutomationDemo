package Iterators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class IteratorRemove {

	public static void main(String[] args) {
		
		System.out.println("*********ArrayList Remove***********");
		ArraylistRemove();
		System.out.println("*********HashSet Remove***********");
		//HashsetDemo();
		System.out.println("*********HashMap Entryset Remove***********");
		//HashmapEntrySet();

	}
public static void ArraylistRemove() {
		
		ArrayList<String> mylist = new ArrayList<String>(); // Size is not fixed in arraylist & Size is fixed in array

		mylist.add("Tipu");
		mylist.add("Sabbir");
		mylist.add("Rahim");
		mylist.add("Mina");

		Iterator<String> itr = mylist.iterator();

		while (itr.hasNext()) {
		String str =  itr.next();
		if(str.equals("Tipu")) {
			itr.remove();	
		}	
		}
		
		Iterator<String> itr1 = mylist.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
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
			String str = itr.next();
			if (str.equals("Sabbir")) {
				itr.remove();
			}

		}
		Iterator<String> itr1 = mylist.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

	public static void HashmapEntrySet() {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Tipu");
		hmap.put(2, "Sabbir");
		hmap.put(3, "Rahim");
		hmap.put(4, "Mina");

		Iterator<Entry<Integer, String>> itr = hmap.entrySet().iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> str = itr.next();
			if ( str.getValue() == "Rahim") {
				itr.remove();
			}
		}
		Iterator<Entry<Integer, String>> itr1 = hmap.entrySet().iterator();
		while (itr1.hasNext()) {
			Entry<Integer, String> str = itr1.next();
			System.out.println(str.getKey() + " = " + str.getValue());
		}

	}
}
