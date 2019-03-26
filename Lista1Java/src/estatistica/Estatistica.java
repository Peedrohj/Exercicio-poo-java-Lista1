package estatistica;
import java.util.Scanner;

public class Estatistica {
	private int number;
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int value) {
		this.number = value;
	}
	
	public int sum() {
		int sum = 0;
		for(int i = 0; i < this.number; i++) {
			sum += this.number - i;
		}
		
		return sum;
	}
	
	public int media() {
		int media = 0;
		media = this.sum()/ this.number;
		
		
		return media;
	}
	
	public float variancia() {
		float des = 0;
		float tot = 0;
		int cont = 0;
		
		for (int i = 0; i <= this.number; i++) {
			des = ((i - this.media()) * (i - this.media()));
			tot += des;
		}
		
		for (int i = 0; i <= this.number; i++) {
			cont++;
		} 

		return tot/cont;
	}
	
	public void parImpar() {
		int num = 0;
		while(num <= this.number) {
			if((num % 2) == 0) {
				System.out.println(num + " é par");
			}
			else {
				System.out.println(num + " é impar");
			}
			num++;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Me informe o número");
		Scanner input = new Scanner(System.in);
		Estatistica obj1 = new Estatistica();
		
		obj1.number = input.nextInt();
		
		System.out.println("A soma é: " + obj1.sum());
		System.out.println("A média é: " + obj1.media());
		System.out.println("A variancia é: " + obj1.variancia());
		obj1.parImpar();
	
		input.close();
	}
}
