package program10;

public class SecreteMessgaeDecoder {
	public static void main(String[] args) {
		//scanner used for user input
		//char ch=scan.next().charAt(0);captial A-65 ,a-97
		char ch='A';
		MessageDecoder m=new MessageDecoder();
		int res=m.decodeCharacter(ch);
		System.out.println(res);
	}

}
