package programming7;
import java.util.Scanner;
public class Main {
	public static void checkMultipleOfTen(int n) {
		if(n%10==0) {
			System.out.println("Number is a multiple of 10");
		}
		else {
			System.out.println("Number is not multiple of 10");
		}
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scan.nextInt();
	checkMultipleOfTen(n);
}
}