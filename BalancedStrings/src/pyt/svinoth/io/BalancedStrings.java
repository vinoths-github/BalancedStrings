package pyt.svinoth.io;

import java.util.Scanner;

public class BalancedStrings {

	public static void main(String[] args) {
		String st;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string:");
		st = sc.nextLine();
		validateStringFormat(st);
	}

	private static void validateStringFormat(String str) {
		int acCount=0,bdCount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'c')
				acCount++;
			else if(str.charAt(i) == 'b' || str.charAt(i) == 'd')
				bdCount++;
			else {
				System.out.println("Invalid Input");
				return;
			}
		}
		if(acCount%2 == 0 && bdCount%2 == 0)
			System.out.println(true);
		else
			System.out.println(false);
	}
}
