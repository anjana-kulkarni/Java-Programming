package program12;

public class HeightConverterApp {
	public static void main(String[] args) {
		HeightConverter h=new HeightConverter();
		double res=h.convertInchesToFeet(72.0);
		System.out.printf("%.2f",res);
	}

}
