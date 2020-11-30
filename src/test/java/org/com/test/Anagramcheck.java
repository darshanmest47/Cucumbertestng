package org.com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first word");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		System.out.println("Enter the Second word");
		Scanner sc1 = new Scanner(System.in);
		String s2 = sc1.nextLine();
		
		String[] vals = s1.split("");
//		System.out.println(vals);
		
		
		String[] vals1 = s2.split("");
//		System.out.println(vals1);
//		for(int i=0;i<vals.length;i++) {
//			System.out.println(vals[i]);
//		}
		
		
		int len = chkAna(vals,vals1);
		if(len == vals.length) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not an anagram");
		}
		

	}
	
	
	public static int chkAna(String[] vals,String[] vals1) {
		int count=0;
		
		if(vals.length!=vals1.length) {
			count=0;
		
			
		}
		Arrays.sort(vals);
		Arrays.sort(vals1);
		
//		for(int i=0;i<vals.length;i++) {
//			System.out.println(vals[i]);
//		
//		}
//		
//		for(int j=0;j<vals1.length;j++) {
//			System.out.println(vals1[j]);
//		}
	
		for(int i=0;i<vals.length;i++) {
			if(vals[i].equals(vals1[i])) {
				count++;
				
			}
			
		
		}
//		System.out.println("count is "+count);
		return count;
		
		
		
	}

}
