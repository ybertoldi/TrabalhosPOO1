package trabalhosPOO.ATT2.A08.Lista03.B;


public class Reptil extends Animal{
	
	private String viveOnde;
	private boolean ehAgressivo;
	
	public String getViveOnde() {
		return viveOnde;
	}
	public void setViveOnde(String viveOnde) {
		this.viveOnde = viveOnde;
	}
	public boolean isEhAgressivo() {
		return ehAgressivo;
	}
	public void setEhAgressivo(boolean ehAgressivo) {
		this.ehAgressivo = ehAgressivo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reptil [viveOnde=");
		builder.append(viveOnde);
		builder.append(", ehAgressivo=");
		builder.append(ehAgressivo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}