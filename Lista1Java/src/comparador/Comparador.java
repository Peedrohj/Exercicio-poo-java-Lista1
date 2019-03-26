package comparador;
import java.util.Scanner;

public class Comparador {
	private float num1;
	private float num2;
	private float num3;
	
	public float getNum1() {
		return num1;
	}
	public void setNum1(float num1) {
		this.num1 = num1;
	}
	public float getNum2() {
		return num2;
	}
	public void setNum2(float num2) {
		this.num2 = num2;
	}
	public float getNum3() {
		return num3;
	}
	public void setNum3(float num3) {
		this.num3 = num3;
	}
	
	public float getMaior() {
		float maior = this.num1 > this.num2 ? num1 : num2;
		maior = maior > this.num3 ? maior : num3;
		return maior;
	}		
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Digite os números");
		float num1 = input.nextInt();
		float num2 = input.nextInt();
		float num3 = input.nextInt();
		
		Comparador comparar = new Comparador();
		comparar.setNum1(num1);
		comparar.setNum2(num2);
		comparar.setNum3(num3);
	
		System.out.println("O maior número é: " + comparar.getMaior());
	
		input.close();
	}
}	
