package trabalhosPOO.ATT2.A08.Lista03.A;

public class Moto extends Veiculo{
	
	private int cilindradas;
	
	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		if (cilindradas > 0)
			this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Moto [cilindradas=");
		builder.append(cilindradas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}