package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex32 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int maiorAcid = Integer.MIN_VALUE, menorAcid = Integer.MAX_VALUE;
        int cidMaior = 0, cidMenor = 0, somaVeic = 0, somaAcid = 0, contAcid = 0;

        for (int i = 0; i < 5; i++) {
            int cod = l.leNum("Cod cidade: ");
            int veic = l.leNum("Veículos: ");
            int acid = l.leNum("Acidentes: ");
            somaVeic += veic;

            if (acid > maiorAcid) {
                maiorAcid = acid;
                cidMaior = cod;
            }
            if (acid < menorAcid) {
                menorAcid = acid;
                cidMenor = cod;
            }

            if (veic < 2000) {
                somaAcid += acid;
                contAcid++;
            }
        }

        System.out.println("Maior índice: " + cidMaior + " com " + maiorAcid);
        System.out.println("Menor índice: " + cidMenor + " com " + menorAcid);
        System.out.println("Média veículos: " + somaVeic / 5);
        System.out.println("Média acidentes < 2000 veic: " + (contAcid > 0 ? somaAcid / contAcid : 0));
    }
}
