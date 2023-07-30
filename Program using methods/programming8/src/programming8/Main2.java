package programming8;

import java.util.Scanner;

public class Main2 {
	public static void identifyCharacter(char ch) {
		if(Character.isDigit(ch)) {
			System.out.println("entered char is digit");
		}
		else if(Character.isLowerCase(ch)) {
			System.out.println("entered char is lowercase");
		}
		else if(Character.isUpperCase(ch)) {
			System.out.println("entered chsr is uppercase");
		}
		else {
			System.out.println("entered char is special character");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);

	}

}
