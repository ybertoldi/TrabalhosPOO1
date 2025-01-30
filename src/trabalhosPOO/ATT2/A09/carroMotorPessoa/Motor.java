package trabalhosPOO.ATT2.A09.carroMotorPessoa;

public class Motor {
	
	private String marca;
	private String combustivel;
	private float potencia;
	private int cilindros;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [marca=");
		builder.append(marca);
		builder.append(", combustivel=");
		builder.append(combustivel);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append(", cilindros=");
		builder.append(cilindros);
		builder.append("]");
		return builder.toString();
	}

}