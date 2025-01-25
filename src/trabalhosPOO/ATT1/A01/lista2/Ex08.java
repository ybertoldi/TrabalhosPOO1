package trabalhosPOO.ATT1.A01.lista2;

import util.Leitor;

public class Ex08 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		int a = l.leNum("nota 1:");
		int b = l.leNum("nota 2:");
		
		if ( (a+b) / 2 > 7 ) {
			System.out.println("aprovado");
		}
		else {
			System.out.println("reprovado");
		}
	}
}
