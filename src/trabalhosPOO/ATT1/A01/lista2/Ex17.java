package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex17 {
    public static void main(String[] args) {
        Leitor l = new Leitor();

        double nota1 = l.leDouble("Digite a primeira nota:");
        double nota2 = l.leDouble("Digite a segunda nota:");
        double media = (nota1 + nota2) / 2;
        String conceito;
        String status;

        if (media >= 9 && media <= 10) {
            conceito = "A";
            status = "APROVADO";
        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
            status = "APROVADO";
        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
            status = "APROVADO";
        } else if (media >= 4 && media < 6) {
            conceito = "D";
            status = "REPROVADO";
        } else {
            conceito = "E";
            status = "REPROVADO";
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Status: " + status);
    }
}
