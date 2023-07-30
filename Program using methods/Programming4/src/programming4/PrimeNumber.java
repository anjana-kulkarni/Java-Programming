package programming4;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number to check prime or not");
	int n=scan.nextInt();
		for(int i=2;i<n;i++) {
		if(n%i==0) {
			System.out.println("it is not a prime number");
			return;
}
}
		System.out.println("it is a prime number");
}
}


