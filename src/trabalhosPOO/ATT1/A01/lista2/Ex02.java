package trabalhosPOO.ATT1.A01.lista2;

import util.Leitor;

public class Ex02 {

	public static void main(String[] args) {
		Leitor l = new Leitor();
		int n = l.leNum("entre o numero:");
		
		if (n > 0) {
			System.out.println("positivo");
		}
		else if (n < 0) {
			System.out.println("negativo");
		}
		else {
			System.out.println("zero");
		}
	}

}
