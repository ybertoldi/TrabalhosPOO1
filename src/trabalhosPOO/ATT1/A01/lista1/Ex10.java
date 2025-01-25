package trabalhosPOO.ATT1.A01.lista1;

import util.Leitor;

public class Ex10 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		int i1 = l.leNum("inteiro 1:");
		int i2 = l.leNum("inteiro 2:");
		double r = l.leDouble("real:");
		
		System.out.println("a: " + ((2*i1) * (i2/2.0f)) );
		System.out.println("b: " + (3.0f*i1 + r) );
		System.out.println("c: " + (r*r*r) );
	}
	
}
