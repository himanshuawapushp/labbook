package com.capg.pkg73;

import java.util.*;

public class Rem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		// System.out.println("Enter the String");
		al.add("himanshu");
		al.add("mishra");
		al.add("sumit");
		al.add("chouhan");
		al.add("vikash");
		al.add("Nagin");
		ArrayList<String> all = new ArrayList<String>();
		// System.out.println("Enter the Second Element");
		all.add("himanshu");
		all.add("sumit");
		all.add("nagin");
		System.out.println(removeElement(al, all));

	}

	public static ArrayList<String> removeElement(ArrayList<String> al, ArrayList<String> all) {
		al.removeAll(all);
		return al;
	}
}
