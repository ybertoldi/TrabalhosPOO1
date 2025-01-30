package trabalhosPOO.ATT2.A08.Lista02.B;


public class Cavalo extends Peca{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cavalo [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}