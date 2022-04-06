package Iterators;

import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {

		System.out.println("*****Set Method*******");
		//ListIteratorSet();
		
		System.out.println("*****Next Index Method*******");
		ListIteratorNextIndex();
		
		System.out.println("*****Previous Method*******");
		ListIteratorPrevious();
		System.out.println("*****Previous Index Method*******");
		PreviousIndex();

	}

	public static void ListIteratorSet() {

		ArrayList<String> mylist = new ArrayList<String>(); // Size is not fixed in arraylist & Size is fixed in array

		mylist.add("Tipu");
		mylist.add("Sabbir");
		mylist.add("Rahim");
		mylist.add("Mina");

		ListIterator<String> itr = mylist.listIterator();

		while (itr.hasNext()) {
			String nextmethod = itr.next();
			if (nextmethod.equals("Sabbir")) {
				itr.set("Radwan");
			}
			System.out.print(" " + nextmethod);

		}

		System.out.println();

		for (String newlist : mylist) {
			System.out.print(" " + newlist + " ");
		}
		System.out.println(System.lineSeparator());

	}
	public static void ListIteratorNextIndex() {

		ArrayList<String> mylist = new ArrayList<String>(); // Size is not fixed in arraylist & Size is fixed in array

		mylist.add("Tipu");
		mylist.add("Sabbir");
		mylist.add("Rahim");
		mylist.add("Mina");

		ListIterator<String> itr = mylist.listIterator();

		while (itr.hasNext()) {
			String nextmethod = itr.next();
			int index = itr.nextIndex();
			
			System.out.print(" " + nextmethod+ "="+index);

		}

		System.out.println(System.lineSeparator());

		
	}


	public static void ListIteratorPrevious() {

		ArrayList<String> mylist = new ArrayList<String>(); // Size is not fixed in arraylist & Size is fixed in array

		mylist.add("Tipu");
		mylist.add("Sabbir");
		mylist.add("Rahim");
		mylist.add("Mina");

		ListIterator<String> itr = mylist.listIterator();
		while (itr.hasNext()) {
			String nextmethod = itr.next();
			System.out.print(" " + nextmethod);
		}

		System.out.println(System.lineSeparator());

		while (itr.hasPrevious()) {
			String previousmethod = itr.previous();
			
			System.out.print(" " + previousmethod);
			
		
		}
		System.out.println(System.lineSeparator());

	}
	public static void PreviousIndex() {

		ArrayList<String> mylist = new ArrayList<String>(); // Size is not fixed in arraylist & Size is fixed in array

		mylist.add("Tipu");
		mylist.add("Sabbir");
		mylist.add("Rahim");
		mylist.add("Mina");

		ListIterator<String> itr = mylist.listIterator();
		while (itr.hasNext()) {
			String nextmethod = itr.next();
			System.out.print(" " + nextmethod);
		}

		System.out.println(System.lineSeparator());

		while (itr.hasPrevious()) {
			String previousmethod = itr.previous();
			int index = itr.previousIndex();
			System.out.print(" " + previousmethod+"=" +index );
			
		
		}
		System.out.println(System.lineSeparator());
	
}
	}
