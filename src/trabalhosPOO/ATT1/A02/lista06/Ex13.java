package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex13 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[20];

        for (int i = 0; i < 10; i++) {
            v1[i] = l.leNum("v1[" + (i + 1) + "]: ");
            v2[i] = l.leNum("v2[" + (i + 1) + "]: ");
        }

        for (int i = 0; i < 10; i++) {
            v3[i * 2] = v1[i];
            v3[i * 2 + 1] = v2[i];
        }

        System.out.print("Vetor intercalado: ");
        for (int n : v3) {
            System.out.print(n + " ");
        }
    }
}
