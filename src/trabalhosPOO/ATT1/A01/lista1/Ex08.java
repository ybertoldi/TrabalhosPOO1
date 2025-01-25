package trabalhosPOO.ATT1.A01.lista1;

import util.Leitor;

public class Ex08 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		int sal = l.leNum("salario por hora:");
		int h = l.leNum("horas trabalhadas no mes:");
		System.out.println("salario final: " + (h * sal));
	}
}
