package com.capg.pkg71;

import java.util.*;

public class Arrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the elements u want:");
		int a = sc.nextInt();
		int p = 0;
		// System.out.print(a);
		ArrayList<Integer> l = new ArrayList<Integer>();
		System.out.print("enter the elements");
		for (int i = 0; i < a; i++) {
			int a1 = sc.nextInt();
			l.add(a1);
			System.out.println(l);
		}
		for (int j : l) {
			String s1 = Integer.toString(j);
			StringBuilder sb = new StringBuilder(s1);
			sb.reverse();
			String s2 = new String(sb);
			Integer in = Integer.parseInt(s2);
			l.set(p, in);
			p++;
		}
		System.out.println("reverse array" + l);

		Collections.sort(l, Collections.reverseOrder());
		System.out.println("reverse sorted array" + l);
	}
}