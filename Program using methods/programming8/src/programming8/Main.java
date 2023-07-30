package programming8;
import java.util.Scanner;
public class Main {
	public static void identifyCharacter(char ch)  {
		if(Character.isDigit(ch)) {
			System.out.println("entered character is digit");
		}
		else if(!Character.isLetter(ch)) {
			System.out.println("entered char is special character");
		}
		else {
			switch(Character.toLowerCase(ch)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch)) {
					System.out.println("entered char is lowercase vowel");
				}
				else {
					System.out.println("entered char is uppercase vowel");
				}
				break;
				default:
					if(Character.isLowerCase(ch)) {
						System.out.println("entered char is lowercase consonent");
					}
					else {
						System.out.println("entered char is uppercase consonent");
					}
			}
		}
	}
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the character");
	char ch=scan.next().charAt(0);
	identifyCharacter(ch);
	}
}
