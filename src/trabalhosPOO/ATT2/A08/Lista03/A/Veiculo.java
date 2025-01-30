package trabalhosPOO.ATT2.A08.Lista03.A;


public class Veiculo {
	
	private boolean motor;

	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		if (motor == true || motor == false)
			this.motor = motor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}

}