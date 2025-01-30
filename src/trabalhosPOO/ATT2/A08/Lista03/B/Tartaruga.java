package trabalhosPOO.ATT2.A08.Lista03.B;

public class Tartaruga extends Reptil{
	
	private String raca;
	private boolean aquatico;
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		if (raca.length() > 0)
			this.raca = raca;
	}
	public boolean isAquatico() {
		return aquatico;
	}
	public void setAquatico(boolean aquatico) {
		if (aquatico == false || aquatico == true)
			this.aquatico = aquatico;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tartaruga [raca=");
		builder.append(raca);
		builder.append(", aquatico=");
		builder.append(aquatico);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}