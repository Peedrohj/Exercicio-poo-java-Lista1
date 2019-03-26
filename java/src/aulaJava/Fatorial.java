package aulaJava;

public class Fatorial {
	private int number;	
	public Fatorial(int value) {
		this.number = value;
	}
	
	public int calcular() {
		int number = this.number;		
		if (this.number == 0 ) {
			return 0;
		}
		
		int result = number;
		while (number > 0) {
			result = result * number - 1;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Fatorial fat = new Fatorial(8);
		System.out.print(fat.calcular());
		
	}
}
