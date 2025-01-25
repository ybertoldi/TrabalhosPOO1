package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex27 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        double numero = l.leDouble("Digite um número:");

        if (numero % 1 == 0) {
            System.out.println("O número " + numero + " é inteiro.");
        } else {
            System.out.println("O número " + numero + " é decimal.");
        }
    }
}
