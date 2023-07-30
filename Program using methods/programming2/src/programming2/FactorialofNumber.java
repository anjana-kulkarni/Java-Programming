package programming2;

import java.util.Scanner;

public class FactorialofNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	int factorial=1;
	for(int i=1;i<=num;i++) {
		factorial=factorial*i;
	}
	System.out.println("factorial res is"+ factorial);
}
}
