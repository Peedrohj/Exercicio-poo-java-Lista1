package aulaJava;

public class Motor {
	
	private float quantidadeCombustivel = 15;
	private int pot;
	private String tipo;
	
	public float setQuantOil(float value) {
		this.quantidadeCombustivel = value;
		return value;
	}
	
	public float getQuantOil() {
		return this.quantidadeCombustivel;
	}
	
	public int setPot (int value) {
		this.pot = value;
		return value;
	}
	
	public int getPot() {
		return this.pot;
	}
	
	public String setTipo (String value) {
		this.tipo = value;
		return value;
	}
	
	public String getTipo () {
		return this.tipo;
	}
	
	public void acelerar() {
		System.out.println("Acelerando . . .");
		float quantOil = this.getQuantOil();
		this.setQuantOil(quantOil - 1);
		System.out.println(this.getQuantOil());
	}
	
	
}
