package Medidas;

public class Medidas {
	private String unidadeDeDsitancia;
	private String unidadeDeTemparatura;
	private String unidadeDeMassa;
	private float distancia;
	private float massa;
	private float temperatura;
	
	public Medidas() {
		
	}

	public Medidas(String unidadeDeDistancia, String unidadeDeTemparatura, String unidadeDeMassa, float distancia, float massa, float temperatura) {
		setUnidadeDeDsitancia(unidadeDeDistancia);
		setUnidadeDeTemparatura(unidadeDeTemparatura);
		setUnidadeDeMassa(unidadeDeMassa);
		setDistancia(distancia);
		setMassa(massa);
		setTemperatura(temperatura);
	}
	
	public String getUnidadeDeDsitancia() {
		return unidadeDeDsitancia;
	}

	public void setUnidadeDeDsitancia(String unidadeDeDsitancia) {
		this.unidadeDeDsitancia = unidadeDeDsitancia;
	}

	public String getUnidadeDeTemparatura() {
		return unidadeDeTemparatura;
	}

	public void setUnidadeDeTemparatura(String unidadeDeTemparatura) {
		this.unidadeDeTemparatura = unidadeDeTemparatura;
	}

	public String getUnidadeDeMassa() {
		return unidadeDeMassa;
	}

	public void setUnidadeDeMassa(String unidadeDeMassa) {
		this.unidadeDeMassa = unidadeDeMassa;
	}

	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}

	public float getMassa() {
		return massa;
	}

	public void setMassa(float massa) {
		this.massa = massa;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	
	
}
