package trabalhosPOO.ATT2.A09.Computador;

public class Memoria {
	
	private String marca;
	private String modelo;
	private float capacidade;
	private float velocidade;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if (marca.length() > 0)
			this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if (modelo.length() > 0)
			this.modelo = modelo;
	}
	public float getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(float capacidade) {
		if (capacidade > 0)
			this.capacidade = capacidade;
	}
	public float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		if (velocidade > 0)
			this.velocidade = velocidade;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Memoria [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", capacidade=");
		builder.append(capacidade);
		builder.append(", velocidade=");
		builder.append(velocidade);
		builder.append("]");
		return builder.toString();
	}

}
