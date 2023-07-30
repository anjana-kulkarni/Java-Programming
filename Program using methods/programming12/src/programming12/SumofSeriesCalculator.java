package programming12;
import java.util.Scanner;
public class SumofSeriesCalculator {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scan.nextInt();
	System.out.println(calculateSumOfSeries(n));
	
}
public static int calculateSumOfSeries(int n) 
{
	for(int i=0;i<=n;i++) {
	   int sum;
	   n=n+1/n;
	}
	return n;
}
}
