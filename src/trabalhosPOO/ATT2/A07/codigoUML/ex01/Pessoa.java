package trabalhosPOO.ATT2.A07.codigoUML.ex01;

public class Pessoa {
	String nome;
	String endereco;
	
	
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getEndereco() {
		return endereco;
	}




	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
	
	
}
