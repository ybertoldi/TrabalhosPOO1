package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex20 {
    public static void main(String[] args) {
        Leitor l = new Leitor();

        int ano = l.leNum("Digite um ano:");
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano é bissexto.");
        } else {
            System.out.println("O ano não é bissexto.");
        }
    }
}
