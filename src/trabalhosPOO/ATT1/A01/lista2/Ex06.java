package trabalhosPOO.ATT1.A01.lista2;

import util.Leitor;

public class Ex06 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		int a = l.leNum("numero:");
		if (a % 2 ==0) {
			System.out.println("versão impar: " + (a+1) );
		}
		else {
			System.out.println("versão par: " + (a-1) );
		}
	}
}
