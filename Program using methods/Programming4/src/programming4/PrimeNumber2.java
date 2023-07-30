package programming4;


import java.util.Scanner;

public class PrimeNumber2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number to check prime or not");
	int n=scan.nextInt();
	boolean isPrime=false;
	if(n<2) {
		System.out.println("entered number"+n+"is not a prime");
	}
	else {
		for(int i=2;i*i<=n;i++) {
			if(n%i!=0) {
				isPrime=true;
				break;
			}
			if(isPrime==true) {
				System.out.println("entered number"+n+"is prime");
			}
			else {
				System.out.println("entered number"+n+"is not a prime");
			}
		}
	}
}
}


