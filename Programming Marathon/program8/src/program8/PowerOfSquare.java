package program8;

import java.util.Scanner;

public class PowerOfSquare {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter num");
	int num=scan.nextInt();
//		int num=7;
		System.out.println(squareNumber(num));
	}
	public static int squareNumber(int num) {
		return num*num;
	}

}
