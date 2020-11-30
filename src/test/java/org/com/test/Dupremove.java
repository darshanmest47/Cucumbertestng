package org.com.test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Dupremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first word");
		Scanner sc = new Scanner(System.in);
		  String s1 = sc.nextLine();
		  
//		  System.out.println("Enter second word");
//		  Scanner sc1 = new Scanner(System.in);
//		String s2 = sc1.nextLine();
		
		HashMap<String,Integer> h1= new HashMap<String,Integer>();
		
		String[] arr1 = s1.split("");
		
		for(String a1:arr1) {
			if(h1.containsKey(a1)) {
			
				h1.put(a1.toLowerCase(), h1.get(a1)+1);
			}
			else {
				h1.put(a1.toLowerCase(),1);
			}
			
		}
		

		
		System.out.println(h1);
		
		Set key1 = h1.keySet();
		
	System.out.println(key1);
	
	for(Object k11:key1) {
		if(h1.get(k11)>1) {
			System.out.println("occurance of "+k11 + " is "+ " "+h1.get(k11));
		}
		else {
			System.out.println("occurance "+ k11+" is "+" "+h1.get(k11));
		}
	}
		
		

	}

}
