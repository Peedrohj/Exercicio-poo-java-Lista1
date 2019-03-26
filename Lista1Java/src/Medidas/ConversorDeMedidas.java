package Medidas;

public class ConversorDeMedidas {
	public void converterMassa(Medidas a, Medidas b) {
		String convertido = "";

		if(a.getUnidadeDeMassa() ==  b.getUnidadeDeMassa()) {
			convertido = "Não é possivél fazer a conversão, pois eles ja tem a mesma unidade.";
			
		}else {
			switch (a.getUnidadeDeMassa()) {
				case "Libras":
					convertido = a.getMassa()/2.2046 + " kg";
					break;
				case "Quilos":
					convertido = a.getMassa()*2.2046 + " lb";				
			}
		}
		
		System.out.println(convertido);
	}
	
	public void converterTemperatura(Medidas a, Medidas b) {
		String convertido = "";

		if(a.getUnidadeDeTemparatura() ==  b.getUnidadeDeTemparatura()) {
			convertido = "Não é possivél fazer a conversão, pois eles ja tem a mesma unidade.";
			
		}else {
			switch (a.getUnidadeDeTemparatura()) {
				case "Fahrenheit":
					convertido = (a.getTemperatura() - 32)/ 1.8 + " Celsius";
					break;
				case "Celsius":
					convertido = (a.getTemperatura() * 1.8) + 32 + " Fahrenheit";
			}
		}
		System.out.println(convertido);
	}
	
	public void converterDistancia(Medidas a, Medidas b) {
		String convertido = "";
		
		if(a.getUnidadeDeMassa() ==  b.getUnidadeDeMassa()) {
			convertido = "Não é possivél fazer a conversão, pois eles ja tem a mesma unidade.";
			
		}else {
			System.out.println("Else");
			
			switch (a.getUnidadeDeDsitancia()) {
				case "Quilômetros":
					convertido = (a.getDistancia() * 1.609) + " Milhas";	
					break;
				case "Milhas":
					convertido = (a.getDistancia()/1.609) + " Quilômetros";
			}
		}
		System.out.println("convertido: "+convertido);
	}
	
	public static void main(String[] args) {
		Medidas objeto1 = new Medidas();
		Medidas objeto2 = new Medidas();
		ConversorDeMedidas conversor = new ConversorDeMedidas();
		
		objeto1.setDistancia(100);
		objeto1.setUnidadeDeDsitancia("Quilômetros");
		
		objeto1.setMassa(100);
		objeto1.setUnidadeDeMassa("Quilos");
		
		objeto1.setTemperatura(100);
		objeto1.setUnidadeDeTemparatura("Celsius");
		
		conversor.converterDistancia(objeto1, objeto2);
		
	}
}
