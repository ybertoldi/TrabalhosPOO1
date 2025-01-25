package trabalhosPOO.ATT1.A01.lista1;

import util.Leitor;

public class Ex3 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		int n1 = l.leNum("nota 1:");
		int n2 = l.leNum("nota 2:");
		int n3 = l.leNum("nota 3:");
		int n4 = l.leNum("nota 4:");
		
		System.out.println("media: " + ((n1+n2+n3+n4) / 4));
	}
}
