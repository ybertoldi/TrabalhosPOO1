package trabalhosPOO.ATT1.A01.lista2;

import util.Leitor;

public class Ex09 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		double h = l.leDouble("altura");
		double p = l.leDouble("peso");
		String s = l.leString("sexo (m/f)");
		double pIdeal = (s.equals("m"))? (72.7*h) - 58 : (62.1*h) - 44.7;
		
		System.out.printf("peso ideal: %.2f \n %s",
				pIdeal,
				((pIdeal < p)? "abaixo do peso ideal" : "acima do peso ideal") );
		
	}
}
