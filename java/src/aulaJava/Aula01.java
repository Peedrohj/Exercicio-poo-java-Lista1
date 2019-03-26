package aulaJava;

import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("num 1");
		int a = input.nextInt();
		System.out.println("num 2");
		int b = input.nextInt();
		System.out.println("num 3");
		int c = input.nextInt();
		
		System.out.printf("Soma %d\nProduto %d",a+b+c , a*b*c);
	
		 
		input.close();
	}

}
