package trabalhosPOO.ATT1.A01.lista2;

import util.Leitor;

public class Ex01 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		int a = l.leNum("num 1:");
		int b = l.leNum("num 2:");
		
		if (a > b) {
			System.out.println(a);
		}
		else if (b > a) {
			System.out.println(b);
		}
		else {
			System.out.println("numeros iguais");
		}
	}
}
