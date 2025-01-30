package trabalhosPOO.ATT2.A08.Lista02.B;


public class Rainha extends Peca{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rainha [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}