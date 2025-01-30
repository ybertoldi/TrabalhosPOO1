package trabalhosPOO.ATT2.A08.Lista02.A;


public class Bomba {
	
	private double totalLitros;
	private float valorLitro;
	
	public boolean abastecerPorLitro(int litro)
	{
		if (litro > 0)
		{
			totalLitros -= litro;
			return true;
		}
		
		else
			return false;
	}
	
	public boolean abastecerPorValor(double valor)
	{
		if (valor > 0)
		{
			totalLitros -= (valor / valorLitro);
			return true;
		}
		
		else 
			return false;
			
	}
	
	public double getTotalListros() {
		return totalLitros;
	}
	public void setTotalListros(double totalLitros) {
		if (totalLitros > 0)
			this.totalLitros = totalLitros;
	}
	public float getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(float valorLitro) {
		if(valorLitro > 0)
			this.valorLitro = valorLitro;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}

}