package programming10;
import java.util.Scanner;
public class Polygon {
	public static void identifyPolygon(int sides)
	{
		if(sides>0) {
		switch(sides) {
		case 3:System.out.println("Triangle"); break;
		case 4:System.out.println("Qudritrial"); break;
		case 5:System.out.println("Pentagon"); break;
		case 6:System.out.println("Hexagon"); break;
		default:System.out.println("Look the cases properly broooooo........");
		}
	}
		else {
			System.out.println("get lostttttt........");
		}
	}
	public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("enter the sides");
    int sides=scan.nextInt();
    identifyPolygon(sides);
	}

}
