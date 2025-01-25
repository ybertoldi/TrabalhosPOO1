package trabalhosPOO.ATT1.A01.lista1;

import util.Leitor;

public class Ex16 {

	public static void main(String[] args) {
		Leitor l = new Leitor();
		double t = l.leDouble("metros quadrados");
		int latas = (int) Math.ceil((t / 6) / 18);
		int gal = (int) Math.ceil((t / 6) / 3.6);
		int pL = latas * 80;
		int pG = gal * 25;
		System.out.printf("latas: %d | preco: R$ %d \ngalões: %d | preco: R$ %d", latas, pL, gal, pG);	
	}

}
