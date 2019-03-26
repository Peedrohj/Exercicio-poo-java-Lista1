package senha;
import java.util.Scanner;

public class PainelDeSenha {
	private int senha;
	
	public PainelDeSenha(int value) {
		setSenha(value);
	}
	
	public void setSenha(int senha) {
		this.senha = senha;

	}
	
	public int getSenha() {
		return this.senha;
	}
	
	public String chamarProximo() {
		int senha = getSenha() + 1;
		if(senha < 10) {
			this.setSenha(senha);
			return "0" + senha;
		}else if(senha > 99) {
			this.setSenha(0);
			return "00";
		}else {
			this.setSenha(senha);
			return "" + senha;
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Número que o painel vai começar");
		int senha = input.nextInt();
		
		while (true) {
			PainelDeSenha painel = new PainelDeSenha(senha);
			System.out.println("1 -> Para próximo /n 2 -> Sair");
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println(painel.chamarProximo());
			}else if (choice == 2) {
				break;
			}
			
		}
		
		input.close();
	}
}
