package trabalhosPOO.ATT1.A01.lista1;

import util.Leitor;

public class Ex07 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		int lado = l.leNum("lado do quadrado:");
		System.out.println("area: " + (lado*lado));
	}
}
