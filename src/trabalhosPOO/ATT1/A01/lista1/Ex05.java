package trabalhosPOO.ATT1.A01.lista1;

import util.Leitor;

public class Ex05 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		int r = l.leNum("raio:");
		System.out.println("Area: " + ((r*r)*3.14f));
	}
}
