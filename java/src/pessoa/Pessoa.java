package pessoa;

public class Pessoa {
	private String nome;
	private float pesoKg;
	private float alturaReal;
	private String CPF;
	private float IMC;
	
	public Pessoa() {
		
	}
	
	public Pessoa( String nome, float peso, float alturaEmM, String CPF ) {
		this.setNome(nome);
		this.setPesoKg(peso);
		this.setAlturaReal(alturaEmM);
		this.setCPF(CPF);
	}
	
	public void setNome (String nome ) {
		this.nome = nome;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public void setPesoKg ( float peso ) {
		this.pesoKg = peso;
	}
	
	public float getPesoKg () {
		return this.pesoKg;
	}
	
	public void setAlturaReal ( float alturaReal ) {
		this.alturaReal = alturaReal;
	}
	
	public float getAlturaReal() {
		return this.alturaReal;
	}
		
	public void setCPF ( String CPF ) {
		this.CPF = CPF;
	}
	
	public String getCPF() {
		return this.CPF;
	}
	
	public void setIMC(float IMC) {
		this.IMC = IMC;
	}
	
	public float getIMC() {
		return this.IMC;
	}
}


