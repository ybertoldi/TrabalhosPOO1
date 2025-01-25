package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex03 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            notas[i] = l.leDouble("nota" + (i + 1) + ": ");
            soma += notas[i];
        }

        double media = soma / 4;
        System.out.println("Notas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println("\nMédia: " + media);
    }
}
