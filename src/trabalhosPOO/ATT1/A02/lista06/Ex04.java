package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex04 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        char[] v = new char[10];
        int consoantes = 0;

        for (int i = 0; i < 10; i++) {
            v[i] = l.leString("caractere" + (i + 1) + ": ").charAt(0);
            if ("bcdfghjklmnpqrtstvwxz".indexOf(v[i]) >= 0) {
                consoantes++;
            }
        }

        System.out.print("Consoantes: ");
        for (char c : v) {
            if ("bcdfghjklmnpqrtstvwxz".indexOf(c) >= 0) {
                System.out.print(c + " ");
            }
        }
        System.out.println("\nTotal de consoantes: " + consoantes);
    }
}
