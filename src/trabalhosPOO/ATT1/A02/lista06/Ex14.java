package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex14 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int[] idades = new int[30];
        double[] alturas = new double[30];
        double somaAlturas = 0;
        int count = 0;

        for (int i = 0; i < 30; i++) {
            idades[i] = l.leNum("Idade aluno " + (i + 1) + ": ");
            alturas[i] = l.leDouble("Altura aluno " + (i + 1) + ": ");
            somaAlturas += alturas[i];
        }

        double mediaAltura = somaAlturas / 30;

        for (int i = 0; i < 30; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                count++;
            }
        }

        System.out.println("Alunos com mais de 13 anos e altura inferior à média: " + count);
    }
}
