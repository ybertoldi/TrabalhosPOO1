package trabalhosPOO.ATT1.A01.lista2;

import java.util.Arrays;
import java.util.List;

import util.Leitor;

public class Ex05 {

	public static void main(String[] args) {
		Leitor l = new Leitor();
		List<String> vogais = Arrays.asList("a", "e", "i", "o", "u");
		String letra = l.leString("digite uma letra");
		
		if(vogais.contains(letra)) {
			System.out.println("é vogal");
		}
		else {
			System.out.println("não é vogal");
		}
	}

}
