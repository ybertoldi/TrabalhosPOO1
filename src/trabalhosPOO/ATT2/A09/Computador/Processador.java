package trabalhosPOO.ATT2.A09.Computador;

public class Processador {
	
	private String marca;
	private String modelo;
	private float clock;
	private float cache;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if (marca.length() > 0)
			this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if (modelo.length() > 0)
			this.modelo = modelo;
	}
	public float getClock() {
		return clock;
	}
	public void setClock(float clock) {
		if (clock > 0)
			this.clock = clock;
	}
	public float getCache() {
		return cache;
	}
	public void setCache(float cache) {
		if (cache > 0)
			this.cache = cache;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Processador [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", clock=");
		builder.append(clock);
		builder.append(", cache=");
		builder.append(cache);
		builder.append("]");
		return builder.toString();
	}

}