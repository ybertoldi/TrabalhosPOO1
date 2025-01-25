package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex01 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int[] v = new int[5];

        for (int i = 0; i < 5; i++) {
            v[i] = l.leNum("n" + (i + 1) + ": ");
        }

        System.out.print("Vetor: ");
        for (int n : v) {
            System.out.print(n + " ");
        }
    }
}
