package trabalhosPOO.ATT1.A01.lista2;

import java.time.Year;

import util.Leitor;

public class Ex04 {

	public static void main(String[] args) {
		Leitor l = new Leitor();
		int ano = l.leNum("ano:");
		if (Year.isLeap(ano)) {
			System.out.println("bissexto");
		}
		else {
			System.out.println("não bissexto");
		}
	}

}
