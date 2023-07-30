import java.util.Scanner;

public class SumofNNaturalNumbers {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int N=scan.nextInt();
	int sum=0;
	for(int i=0;i<=N;i++) {
		sum=sum+i;
	}
System.out.println("sum is"+ sum);
}
}
