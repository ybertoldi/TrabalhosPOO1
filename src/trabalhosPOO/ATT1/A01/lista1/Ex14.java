package trabalhosPOO.ATT1.A01.lista1;

import util.Leitor;

public class Ex14 {
	public static void main(String[] args) {
		Leitor l = new Leitor();
		double ph = l.leDouble("pagamento por hora:");
		int h = l.leNum("Horas trabalhadas:");
		double salBrut = ph * h;
		double INSS = salBrut * 0.08;
		double sind = salBrut * 0.05;
		double ipRenda = salBrut * 0.11;
		double salLiq = salBrut - (INSS + sind + ipRenda);
		
		System.out.printf(
				"Sal. bruto: R$ %.2f \nIR: R$ %.2f \nINSS: R$ %.2f \nSindicato: R$ %.2f \nSal. liquido: R$ %.2f", 
				salBrut,
				ipRenda,
				INSS,
				sind,
				salLiq);
	}
}
