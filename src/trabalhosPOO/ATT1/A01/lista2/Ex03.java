package trabalhosPOO.ATT1.A01.lista2;

import util.Leitor;

public class Ex03 {

	public static void main(String[] args) {
		Leitor l = new Leitor();
		String s = l.leString("sexo:");
		
		if (s.equals("f")) {
			System.out.println("mulher");
		}
		else if (s.equals("m")) {
			System.out.println("homem");
		}
		else {
			System.out.println("outro");
		}
	}

}
