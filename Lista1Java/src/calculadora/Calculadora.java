package calculadora;
import java.util.Scanner;

public class Calculadora {
	
	public float somar(int a, int b) {
		return a + b;
	}
	public float subtrair(int a, int b) {
		return a - b;
	}
	public float multiplicar (int a, int b) {
		return a * b;
	}
	public float dividir(int a, int b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		Scanner input = new Scanner (System.in);
		System.out.println("Digite o número 1");
		int num1 = input.nextInt();
		System.out.println("Digite o número 2");
		int num2 = input.nextInt();
		
		System.out.println("Qual operação vai ser realizada ?");
		String operador = input.next();
		
		
		switch (operador) {
			case "+":
				System.out.println("O resultado da soma foi: " + calculadora.somar(num1, num2));			
				break;
			case "-":
				System.out.println("O resultado da subtração foi: " + calculadora.subtrair(num1, num2));		
				break;
			case "/":
				System.out.println("O resultado da divisão foi: " + calculadora.dividir(num1, num2));
				break;
			case "*":
				System.out.println("O resultado da multipliação foi: " + calculadora.multiplicar(num1, num2));		
				break;
		}
		
		input.close();
	}
}
