package com.capg.pkg74;

import java.util.*;

public class Square {
	public static void main(String args[]) {
		Square s1 = new Square();
		List<Integer> l = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for (int i = 0; i < a; i++) {
			int a1 = s.nextInt();
			l.add(a1);
		}
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		h = s1.getSquare(l);
		System.out.println(h);

	}

	public static HashMap getSquare(List<Integer> l) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : l) {
			hm.put(i, (i * i));
		}

		return hm;

	}

}