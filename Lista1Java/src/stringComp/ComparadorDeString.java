package stringComp;
import java.util.Scanner;

public class ComparadorDeString {
	public void reverseString(String frase1, String frase2) {
		String reverse = "";
		
		for(int i = frase1.length() - 1; i >= 0; i--) {
			reverse += frase1.charAt(i);
		}
		
		System.out.println("reverse: " + reverse);
		if(reverse.equals(frase2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String frase1 = "";
		String frase2 = "";
		ComparadorDeString comp = new ComparadorDeString();
		
		System.out.println("Digite a primeira String: ");
		frase1 = input.next();
		System.out.println("Digite a segunda String: ");
		frase2 = input.next();
		comp.reverseString(frase1, frase2);
		
		input.close();
		
	}
}
