package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex16 {
    public static void main(String[] args) {
        Leitor l = new Leitor();

        double media = l.leDouble("Digite a média do aluno:");

        if (media >= 0 && media < 3) {
            System.out.println("Reprovado");
        } else if (media >= 3 && media < 7) {
            System.out.println("Em Exame");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Média inválida.");
        }
    }
}
