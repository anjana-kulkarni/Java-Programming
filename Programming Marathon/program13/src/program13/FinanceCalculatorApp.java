package program13;

public class FinanceCalculatorApp {
	public static void main(String[] args) {
		FinanceCalculator f=new FinanceCalculator();
		double d =f.calculateSimpleInterest(1000.0,0.05,2.0);
		System.out.printf("%.2f",d);
	}
	

}
