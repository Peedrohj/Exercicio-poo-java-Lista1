package pessoa;

public class IMC {
	public void calcIMC (Pessoa pessoa) {
		float peso = pessoa.getPesoKg();
		float altura = pessoa.getAlturaReal();
		float IMC = peso / (altura * altura);
		
		pessoa.setIMC(IMC);
		
	}
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa ("Pedro", 70, 1.60f, "09168780400");
		IMC imc = new IMC();
		
		imc.calcIMC(pessoa);
		System.out.println(pessoa.getIMC());
	}
}
