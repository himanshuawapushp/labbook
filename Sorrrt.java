package com.capg.pkg75;

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Sorrrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorrrt so = new Sorrrt();
		List<String> ll = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the element");
		for (int i = 0; i < 5; i++) {
			String al = scanner.nextLine();
			ll.add(al);
		}
		System.out.println("Sorted Array are");
		so.s(ll);

	}

	public void s(List<String> ll) {
		Collections.sort(ll);
		for (String s : ll) {
			System.out.println(s);
		}
	}

}
