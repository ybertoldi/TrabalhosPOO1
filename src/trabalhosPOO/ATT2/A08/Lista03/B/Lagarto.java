package trabalhosPOO.ATT2.A08.Lista03.B;


public class Lagarto extends Reptil{

	private String raca;
	private boolean agressivo;

	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		if (raca.length() > 0)
			this.raca = raca;
	}
	public boolean isAgressivo() {
		return agressivo;
	}
	public void setAgressivo(boolean agressivo) {
		if (agressivo == true || agressivo == false)
			this.agressivo = agressivo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lagarto [raca=");
		builder.append(raca);
		builder.append(", agressivo=");
		builder.append(agressivo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}