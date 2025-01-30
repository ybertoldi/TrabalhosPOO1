package trabalhosPOO.ATT2.A08.Lista02.A;


public class BombaGasolina extends Bomba{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaGasolina [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}