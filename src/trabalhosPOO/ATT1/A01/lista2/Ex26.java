package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex26 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int numero = l.leNum("Digite um número inteiro:");

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}
