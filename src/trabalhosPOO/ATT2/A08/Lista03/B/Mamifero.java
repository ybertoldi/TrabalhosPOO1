package trabalhosPOO.ATT2.A08.Lista03.B;


public class Mamifero extends Animal{
	
	private String regiaoHabitat;
	private String habito;
	
	
	public String getRegiaoHabitat() {
		return regiaoHabitat;
	}
	public void setRegiaoHabitat(String regiaoHabitat) {
		if (regiaoHabitat.length() > 0)
			this.regiaoHabitat = regiaoHabitat;
	}
	public String getHabito() {
		return habito;
	}
	public void setHabito(String habito) {
		if (habito.length() > 0)
			this.habito = habito;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [regiaoHabitat=");
		builder.append(regiaoHabitat);
		builder.append(", habito=");
		builder.append(habito);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}