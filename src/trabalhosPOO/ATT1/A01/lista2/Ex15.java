package trabalhosPOO.ATT1.A01.lista2;

import util.Leitor;

public class Ex15 {
	public static void main(String[] args) {
        Leitor l = new Leitor();

        double pC = l.leDouble("Digite o preço de custo do produto:");
        int cO = l.leNum("Digite o código de origem do produto (1 a 8):");

        String proc;

        switch (cO) {
            case 1:
                proc = "Sul";
                break;
            case 2:
                proc = "Norte";
                break;
            case 3:
                proc = "Leste";
                break;
            case 4:
                proc = "Oeste";
                break;
            case 5:
            case 6:
                proc = "Nordeste";
                break;
            case 7:
            case 8:
                proc = "Centro-oeste";
                break;
            default:
                proc = "Importado";
        }

        System.out.println("Preço de custo: R$ " + pC);
        System.out.println("Procedência: " + proc);
	}
}
