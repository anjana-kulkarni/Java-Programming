package programming6;

import java.util.Scanner;

public class GradeCheck {
	public static void checkGrade(int grade) {
		if(grade>50) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter grade");
	int grade=scan.nextInt();
	checkGrade(grade);
}
}
