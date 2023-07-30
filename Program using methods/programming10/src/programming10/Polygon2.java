package programming10;
import java.util.Scanner;
public class Polygon2 {
	public static void identifyPolygon(int sides)
	{
		if(sides==3) {
			System.out.println("Entered sides"+ sides +" is a Triangle");
		}
		else if(sides==4) {
			System.out.println("Entered sides"+ sides +" is a Qudretrial");
		}
		else if(sides==5) {
			System.out.println("Entered sides"+ sides +" is a pentagon");
		}
		else if(sides==6) {
			System.out.println("Entered sides"+ sides +" is a Hexagon");
		}
		else {
			System.out.println("--------------");
		}
	}
	public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("enter the sides");
    int sides=scan.nextInt();
    identifyPolygon(sides);
	}

}
