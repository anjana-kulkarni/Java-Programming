package program9;

import java.util.Scanner;

public class CubeMystery {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the num");
	int num=scan.nextInt();
	//int num=3;
	System.out.println(cubeNumber(num));

}
public static int cubeNumber(int num) {
	return num*num*num;
}
}
