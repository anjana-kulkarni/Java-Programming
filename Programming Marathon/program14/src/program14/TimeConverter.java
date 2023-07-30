package program14;

import java.util.Scanner;

public class TimeConverter {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the minutes");
	float minutes=scan.nextFloat();
	System.out.println(convertToHours(minutes));
	
}
public static double convertToHours(float minutes) {
	float hour=minutes/60;
	return hour;
}
}
