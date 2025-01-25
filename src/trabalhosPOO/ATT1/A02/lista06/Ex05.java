package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex05 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int[] v = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int pIndex = 0, iIndex = 0;

        for (int i = 0; i < 20; i++) {
            v[i] = l.leNum("n" + (i + 1) + ": ");
            if (v[i] % 2 == 0) {
                par[pIndex++] = v[i];
            } else {
                impar[iIndex++] = v[i];
            }
        }

        System.out.print("Vetor: ");
        for (int n : v) {
            System.out.print(n + " ");
        }

        System.out.print("\nPAR: ");
        for (int i = 0; i < pIndex; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.print("\nIMPAR: ");
        for (int i = 0; i < iIndex; i++) {
            System.out.print(impar[i] + " ");
        }
    }
}
