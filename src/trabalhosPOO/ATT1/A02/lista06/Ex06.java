package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex06 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        double[] medias = new double[10];
        int alunosAprovados = 0;

        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += l.leDouble("nota" + (j + 1) + " aluno " + (i + 1) + ": ");
            }
            medias[i] = soma / 4;
            if (medias[i] >= 7.0) {
                alunosAprovados++;
            }
        }

        System.out.println("Alunos com média >= 7.0: " + alunosAprovados);
    }
}
