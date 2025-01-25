package trabalhosPOO.ATT1.A01.lista2;

import util.Leitor;

public class Ex12 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		double sal = l.leDouble("salario:");
		double salF;
		
		if (sal <= 280) {
			salF = sal *1.2;
		}
		else if (sal <= 700) {
			salF = sal * 0.15;
		}
		else if (sal <= 1500) {
			salF = sal * 1.1;
		}
		else {
			salF = sal * 0.05; 
		}
		
		System.out.println("novo salario: " + salF);
	}
}
