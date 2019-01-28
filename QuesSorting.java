package com.capg.lab38;

	import java.util.*;

	public class QuesSorting {
		static Scanner sc=new Scanner(System.in);
		static String str=sc.nextLine();
		static int[] a = new int[str.length()];
		static int[] l = new int[str.length()];
		static String[] s;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			sort();
		}
		
		private static void sort(){
			str=str.toLowerCase();
			char ch;
			for(int i=0;i<str.length();i++){
				ch=str.charAt(i);
				a[i]=(int)ch;
			}
			Arrays.sort(a);
			if(str.length()%2==0){
			for(int i=0;i<str.length()/2;i++){
				char q;
				q=(char)a[i];
				char w=Character.toUpperCase(q);
				System.out.print(w);
			}
			for(int i=str.length()/2;i<str.length();i++){
				char e;
				e=(char)a[i];
				char t=Character.toLowerCase(e);
				System.out.print(t);
			}
			}
			else{
			for(int i=0;i<(str.length()/2)+1;i++){
				char q;
				q=(char)a[i];
				char w=Character.toUpperCase(q);
				System.out.print(w);
			}
			for(int i=(str.length()/2)+1;i<str.length();i++){
				char e;
				e=(char)a[i];
				char t=Character.toLowerCase(e);
				System.out.print(t);
			}
		}}
	}



