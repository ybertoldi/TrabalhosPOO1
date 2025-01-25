package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex15 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        final int N = 5; // Tamanho do vetor
        int[] valores = new int[N];

        for (int i = 0; i < N; i++) {
            valores[i] = l.leNum("Valor " + (i + 1) + ": ");
            while (valores[i] < 0 || valores[i] > 20) {
                valores[i] = l.leNum("Valor inválido. Valor " + (i + 1) + ": ");
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(valores[i] + ": ");
            for (int j = 0; j < valores[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
