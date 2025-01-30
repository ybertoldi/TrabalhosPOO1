package trabalhosPOO.ATT2.A08.Lista03.B;


public class Animal {
	
	private String cor;
	private boolean temPelo;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isTemPelo() {
		return temPelo;
	}
	public void setTemPelo(boolean temPelo) {
		this.temPelo = temPelo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [cor=");
		builder.append(cor);
		builder.append(", temPelo=");
		builder.append(temPelo);
		builder.append("]");
		return builder.toString();
	}

}