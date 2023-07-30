public class pattern3 {
public static void main(String[] args) {
	for(int i=1;i<=3;i++) {
		for(int j=3;j>=i;j--) {
			if(i==1||j==1||i==3||j==3)
			System.out.print("* ");	
			else
				System.out.print("  ");
		}
		System.out.println(  );
	}
}
}
