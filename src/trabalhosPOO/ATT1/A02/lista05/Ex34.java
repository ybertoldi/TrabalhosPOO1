package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex34 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;

        while (true) {
            int n = l.leNum("Número (negativo para sair): ");
            if (n < 0) break;

            if (n <= 25) c1++;
            else if (n <= 50) c2++;
            else if (n <= 75) c3++;
            else if (n <= 100) c4++;
        }

        System.out.println("[0-25]: " + c1);
        System.out.println("[26-50]: " + c2);
        System.out.println("[51-75]: " + c3);
        System.out.println("[76-100]: " + c4);
    }
}
