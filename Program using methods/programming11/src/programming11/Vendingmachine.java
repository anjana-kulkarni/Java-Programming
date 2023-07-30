package programming11;
import java.util.Scanner;
public class Vendingmachine {
	public static void getProduct(String productCode)
	{
		switch(productCode) {
		case "p01":System.out.println("COCA COLA");
		break;
		case "p02":System.out.println("SPRITE");
		break;
		case "p03":System.out.println("PEPSI");
		break;
		case "p04":System.out.println("MAZZAA");
		break;
		default:System.out.println("BINDU JAL JEERA.....");
		break;
		}
	}
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the product name");
    String code=scan.next();
    getProduct(code);
	}

}
