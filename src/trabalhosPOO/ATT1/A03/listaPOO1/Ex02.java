package trabalhosPOO.ATT1.A03.listaPOO1;
import util.Leitor;

public class Ex02 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int a = l.leNum("n1: ");
        int b = l.leNum("n2: ");

        if (a > b) {
            System.out.println("Valores invertidos, ajustando...");
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
