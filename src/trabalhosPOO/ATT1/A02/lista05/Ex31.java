package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex31 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int maxAltura = Integer.MIN_VALUE, minAltura = Integer.MAX_VALUE;
        int alunoMax = 0, alunoMin = 0;

        for (int i = 0; i < 10; i++) {
            int num = l.leNum("Aluno: ");
            int alt = l.leNum("Altura (cm): ");

            if (alt > maxAltura) {
                maxAltura = alt;
                alunoMax = num;
            }
            if (alt < minAltura) {
                minAltura = alt;
                alunoMin = num;
            }
        }

        System.out.println("Mais alto: " + alunoMax + " com " + maxAltura + "cm");
        System.out.println("Mais baixo: " + alunoMin + " com " + minAltura + "cm");
    }
}
