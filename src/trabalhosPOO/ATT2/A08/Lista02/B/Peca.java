package trabalhosPOO.ATT2.A08.Lista02.B;


public class Peca {
	
	private int linha;
	private int coluna;
	private boolean cor;
	private int movimentos;
	
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		if (linha > 0)
			this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		if (coluna > 0)
			this.coluna = coluna;
	}
	public boolean isCor() {
		return cor;
	}
	public void setCor(boolean cor) {
		if (cor == true || cor == false)
			this.cor = cor;
	}
	public int getMovimentos() {
		return movimentos;
	}
	public void setMovimentos(int movimentos) {
		if (movimentos > 0)
			this.movimentos = movimentos;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Peca [linha=");
		builder.append(linha);
		builder.append(", coluna=");
		builder.append(coluna);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", movimentos=");
		builder.append(movimentos);
		builder.append("]");
		return builder.toString();
	}	

}