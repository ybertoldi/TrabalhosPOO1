package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex25 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int valor = l.leNum("Digite o valor do saque (entre 10 e 600 reais):");

        if (valor < 10 || valor > 600) {
            System.out.println("Valor inválido.");
        } else {
            int notas100 = valor / 100;
            valor %= 100;

            int notas50 = valor / 50;
            valor %= 50;

            int notas10 = valor / 10;
            valor %= 10;

            int notas5 = valor / 5;
            valor %= 5;

            int notas1 = valor;

            System.out.printf("Notas de 100: %d%n", notas100);
            System.out.printf("Notas de 50: %d%n", notas50);
            System.out.printf("Notas de 10: %d%n", notas10);
            System.out.printf("Notas de 5: %d%n", notas5);
            System.out.printf("Notas de 1: %d%n", notas1);
        }
    }
}
