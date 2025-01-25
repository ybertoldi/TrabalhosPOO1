package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex23 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int idade1 = l.leNum("Digite a idade do primeiro aluno:");
        int idade2 = l.leNum("Digite a idade do segundo aluno:");
        int idade3 = l.leNum("Digite a idade do terceiro aluno:");

        double media = (idade1 + idade2 + idade3) / 3.0;

        if (media < 25) {
            System.out.println("Turma Jovem");
        } else if (media <= 40) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }
    }
}
