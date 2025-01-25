package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex02 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        double[] v = new double[10];

        for (int i = 0; i < 10; i++) {
            v[i] = l.leDouble("n" + (i + 1) + ": ");
        }

        System.out.print("Inverso: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
    }
}
