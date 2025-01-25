package trabalhosPOO.ATT1.A01.lista1;

import util.Leitor;

public class Ex15 {

	public static void main(String[] args) {
		Leitor l = new Leitor();
		double t = l.leDouble("metros quadrados");
		int latas = (int) Math.ceil((t / 3) / 18);
		int p = latas * 80;
		System.out.printf("latas: %d | preco: R$ %d", latas, p);
	}

}
