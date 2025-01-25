package trabalhosPOO.ATT1.A01.lista1;

import util.Leitor;

public class Ex13 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		double peso = l.leDouble("peso de peixes:");
		if (peso > 50) {
			double exc = peso - 50;
			System.out.println("taxa de RS$" + (exc * 4) );
		}
		else {
			System.out.println("sem taxa a pagar.");
		}
		
	}
}
