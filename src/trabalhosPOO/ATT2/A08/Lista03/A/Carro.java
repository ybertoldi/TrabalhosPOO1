package trabalhosPOO.ATT2.A08.Lista03.A;

public class Carro extends Veiculo{
	
	private int numero_portas;
	
	

	public int getNumero_portas() {
		return numero_portas;
	}

	public void setNumero_portas(int numero_portas) {
		if (numero_portas > 0)
			this.numero_portas = numero_portas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [numero_portas=");
		builder.append(numero_portas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}