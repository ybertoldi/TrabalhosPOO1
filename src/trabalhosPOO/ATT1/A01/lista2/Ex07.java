package trabalhosPOO.ATT1.A01.lista2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import util.Leitor;

public class Ex07 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(l.leNum("num 1"));
		lista.add(l.leNum("num 2"));
		lista.add(l.leNum("num 3"));
		Collections.sort(lista);
		
		for (int i: lista) {
			System.out.println(i);
		}
		
	}
	
}
