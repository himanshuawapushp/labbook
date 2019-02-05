package com.capg.pkg72;

import java.util.*;


public class Operation {

	public String replace(String[] str, String str2) {
		String a = "";
		for (int i = 1; i < str.length; i++) {

			str[i] = str2;

			i++;
		}

		for (int i = 0; i < str.length; i++) {
			a += str[i];
		}
		return a;

	}

	public String rev(String arg1, String str2) {

		StringBuilder sb = new StringBuilder(arg1);
		sb.reverse();
		String b = sb.toString();
		StringBuilder sb1 = new StringBuilder(str2);
		sb1.reverse();
		String b1 = sb1.toString();
		String s = b.replaceFirst(b1, str2);
		StringBuilder sb2 = new StringBuilder(s);
		sb2.reverse();
		String res = sb2.toString();

		return res;
	}

	public String dup(String arg1, String str2) {

		int count = 0, fromIndex = 0;

		while ((fromIndex = arg1.indexOf(str2, fromIndex)) != -1) {
			count++;
			fromIndex++;

		}
		if (count > 1) {
			String a = arg1.replaceFirst(str2, "");
			return a;
		} else {
			return arg1;
		}
	}

	public String add(String arg3, String str2) {
		String begin = null;
		String end = null;
		String res = "";
		if (str2.length() % 2 == 0) {
			begin = str2.substring(0, ((str2.length()) / 2));
			end = str2.substring(((str2.length()) / 2), str2.length());
			res = begin + arg3 + end;
			return res;
		} else {
			begin = str2.substring(0, (str2.length() + 1) / 2);
			end = str2.substring(((str2.length() + 1) / 2), str2.length());
			res = begin + arg3 + end;
			return res;

		}
	}

	public String rep(String arg4, String str2) {
		String[] a = arg4.split("");
		String[] b = str2.split("");
		String c = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (b[j].equals(a[i])) {
					a[i] = "#";

				}
			}
			c += a[i];

		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st string");
		ArrayList<String> list = new ArrayList();
		String str1 = s.next();
		String[] str = str1.split("");
		System.out.println("enter 2nd string");
		String str2 = s.next();
		Operation obj = new Operation();
		String entry = obj.replace(str, str2);
		list.add(entry);

		String arg1 = list.get(0);
		// String[] arg=arg1.split("");
		String entry1 = obj.rev(arg1, str2);
		list.add(entry1);
		String arg2 = list.get(1);
		String entry2 = obj.dup(arg2, str2);
		list.add(entry2);
		String arg3 = list.get(2);
		String entry3 = obj.add(arg3, str2);
		list.add(entry3);
		String arg4 = list.get(3);
		String entry4 = obj.rep(arg4, str2);
		list.add(entry4);
		System.out.println(list);

	}

}
