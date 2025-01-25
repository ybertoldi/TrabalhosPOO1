package trabalhosPOO.ATT1.A01.lista1;

import util.Leitor;

public class Ex11 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		double a = l.leDouble("altura:");
		System.out.println("peso ideal: " + (72.7d * a - 58));
	}
}
