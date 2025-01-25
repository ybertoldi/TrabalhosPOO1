package trabalhosPOO.ATT1.A01.lista2;

import util.Leitor;

public class Ex14 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		int dia = l.leNum("digite um numero de 1-7");
		String s = "";
		
		switch(dia) {
		case 1:
			s = "domingo";
			break;
		case 2:
			s = "segunda";
			break;
		case 3:
			s = "terça";
			break;
		case 4:
			s = "quarta";
			break;
		case 5:
			s = "quinta";
			break;
		case 6:
			s = "sexta";
			break;
		case 7:
			s = "sabado";
			break;
		}
		
		System.out.println(s);
	}
}
