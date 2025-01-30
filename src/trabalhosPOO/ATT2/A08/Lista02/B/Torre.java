package trabalhosPOO.ATT2.A08.Lista02.B;


public class Torre extends Peca{
	
	public boolean Mover(int line, int col)
	{
		
		if (line > 0 && col > 0)
		{
			
		
			setLinha(line);
			setColuna(col);
			return true;
		}
		
		else
			return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Torre [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}