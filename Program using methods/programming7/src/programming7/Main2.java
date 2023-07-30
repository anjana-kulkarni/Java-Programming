package programming7;
import java.util.Scanner;
public class Main2 {
	public static void checkMultiple(int n1,int n2) {
		if(n1%n2==0) {
			System.out.println(n1+" is multiple of "+n2);
		}
		else {
			System.out.println(n1+" is not  multiple of "+n2);
		}
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n1=scan.nextInt();
	int n2=scan.nextInt();
	checkMultiple(n1,n2);
}
}
