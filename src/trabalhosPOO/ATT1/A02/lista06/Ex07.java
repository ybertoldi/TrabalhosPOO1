package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex07 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int[] v = new int[5];
        int soma = 0, multiplicacao = 1;

        for (int i = 0; i < 5; i++) {
            v[i] = l.leNum("n" + (i + 1) + ": ");
            soma += v[i];
            multiplicacao *= v[i];
        }

        System.out.print("Vetor: ");
        for (int n : v) {
            System.out.print(n + " ");
        }
        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
    }
}
