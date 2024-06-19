package com.stringprogramme;

import java.util.Scanner;

public class ReverseWordInSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Type any Statement :");
	    String statement = sc.nextLine();
	    String[] str = statement.split(" ");
	    
	    for (int i = 0; i < str.length; i++) {
	    	String word = str[i];            
	    	char[] c = word.toCharArray();
			for (int j = c.length-1; j >=0; j--) {
				System.out.print(c[j]);
			}System.out.print(" ");
		}    
	}
}
