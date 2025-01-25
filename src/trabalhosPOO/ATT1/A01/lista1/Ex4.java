package trabalhosPOO.ATT1.A01.lista1;

import util.Leitor;

public class Ex4 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		int m = l.leNum("quantos metros?");
		System.out.println((m*100) + " centimetros");
	}
}
