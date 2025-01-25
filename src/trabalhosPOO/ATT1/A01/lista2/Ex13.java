package trabalhosPOO.ATT1.A01.lista2;

import util.Leitor;

public class Ex13 {
	
	public static void main(String[] args) {
		Leitor l = new Leitor();
		double ph = l.leDouble("salario hora:");
		int h = l.leNum("horas trabalhadas:");
		
		double sal = h * ph;
		double inss = sal * 0.1d;
		double fgts = sal * 0.11d;
		double ir;
		
		if (sal <= 900) {
			ir = 0;
		}
		else if (sal <= 1500) {
			ir = sal * 0.05d;
		}
		else if (sal <= 2500) {
			ir = sal * 0.1d;
		}
		else {
			ir = sal * 0.2d;
		}
		
		double salLiq = sal - (ir + inss);
		
		System.out.println("salario bruto: " + sal);
		System.out.println("IR: " + ir);
		System.out.println("INSS: " + inss);
		System.out.println("FGTS: " + fgts);
		System.out.println("salario liquido: " + salLiq);
		
	}
}
