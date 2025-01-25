package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex24 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        double nota1 = l.leDouble("Digite a primeira nota:");
        double nota2 = l.leDouble("Digite a segunda nota:");
        double nota3 = l.leDouble("Digite a terceira nota:");

        double media = (nota1 + nota2 + nota3) / 3;

        if (media == 10) {
            System.out.printf("Aprovado com Distinção! Média: %.2f%n", media);
        } else if (media >= 7) {
            System.out.printf("Aprovado! Média: %.2f%n", media);
        } else {
            System.out.printf("Reprovado! Média: %.2f%n", media);
        }
    }
}
