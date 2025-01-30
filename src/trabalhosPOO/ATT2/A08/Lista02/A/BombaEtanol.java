package trabalhosPOO.ATT2.A08.Lista02.A;

public class BombaEtanol extends Bomba{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaEtanol [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}