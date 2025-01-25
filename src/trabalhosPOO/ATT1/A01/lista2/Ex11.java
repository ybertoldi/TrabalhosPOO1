package trabalhosPOO.ATT1.A01.lista2;

import util.Leitor;

public class Ex11 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		char s = (l.leString("Qual seu turno? (M, V ou N)")).charAt(0);
		switch (s) {
		case 'M':
			System.out.println("bom dia");
			break;
		case 'V':
			System.out.println("boa tarde");
			break;
		case 'N':
			System.out.println("boa noite");
			break;
		}
	}
}
