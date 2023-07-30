package programming5;

import java.util.Scanner;

public class PurchaseAmount {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter purchase amount");
	double p=scan.nextDouble();
	checkDiscount(p);
}
public static void checkDiscount(double purchaseAmount) {
	if(purchaseAmount>100) {
		System.out.println("Discount applicable");
	}
	else {
		System.out.println("discount not applicable");
	}
}
}
