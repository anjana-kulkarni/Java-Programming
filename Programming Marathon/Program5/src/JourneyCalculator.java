import java.util.*;
public class JourneyCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the speed and time as real numbers");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculatorApp c=new JourneyCalculatorApp();
		System.out.printf("%.2f",c.calculateDistance(speed,time));
	}
}
class JourneyCalculatorApp{
	public double calculateDistance(double speed,double time) {
		double distance=speed*time;
		return distance;
	}
}
