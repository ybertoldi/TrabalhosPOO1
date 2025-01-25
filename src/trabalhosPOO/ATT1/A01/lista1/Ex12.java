package trabalhosPOO.ATT1.A01.lista1;

import util.Leitor;

public class Ex12 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		String s = l.leString("Qual seu sexo? (h/m)");
		double h = l.leDouble("Qual sua altura? ");
		if (s.equals("h")) {
			System.out.println("peso ideal: " + ((72.7*h) - 58) );
		}
		else {
			System.out.println("peso ideal: " + ((62.1*h) - 44.7) );
		}
	}
}
