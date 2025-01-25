package trabalhosPOO.ATT1.A01.lista1;

import util.Leitor;

public class Ex09 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		int F = l.leNum("graus em Fahrenheit:");
		System.out.println("celsius: " + ((5/9)*(F - 32)));
	}
}
