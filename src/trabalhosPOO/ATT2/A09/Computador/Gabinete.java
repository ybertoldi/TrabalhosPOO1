package trabalhosPOO.ATT2.A09.Computador;

public class Gabinete {
	
	private String modelo;
	private String tipo;
	private int baias;
	protected PlacaMae placamae;
	
	public Gabinete()
	{
		placamae = new PlacaMae();
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if (modelo.length() > 0)
			this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if (tipo.length() > 0)
			this.tipo = tipo;
	}
	public int getBaias() {
		return baias;
	}
	public void setBaias(int baias) {
		if (baias > 0)
			this.baias = baias;
	}
	public PlacaMae getPlacamae() {
		return placamae;
	}
	public void setPlacamae(PlacaMae placamae) {
		this.placamae = placamae;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gabinete [modelo=");
		builder.append(modelo);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", baias=");
		builder.append(baias);
		builder.append(", placamae=");
		builder.append(placamae);
		builder.append("]");
		return builder.toString();
	}

}