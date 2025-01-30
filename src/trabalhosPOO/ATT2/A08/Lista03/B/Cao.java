package trabalhosPOO.ATT2.A08.Lista03.B;

public class Cao extends Mamifero{
	
	private String raca;
	private double peso;
	
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		if(raca.length() > 0)
			this.raca = raca;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if (peso > 0)
			this.peso = peso;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cao [raca=");
		builder.append(raca);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
