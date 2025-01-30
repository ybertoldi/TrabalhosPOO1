package trabalhosPOO.ATT2.A08.Lista03.B;

public class Gato extends Mamifero{
	
	private String raca;
	private boolean temPelo;
	
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		if (raca.length() > 0)
			this.raca = raca;
	}
	public boolean isTemPelo() {
		return temPelo;
	}
	public void setTemPelo(boolean temPelo) {
		if (temPelo == false || temPelo == true)
			this.temPelo = temPelo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gato [raca=");
		builder.append(raca);
		builder.append(", temPelo=");
		builder.append(temPelo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}