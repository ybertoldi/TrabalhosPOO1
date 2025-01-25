package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex23 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int turmas = l.leNum("quantidade de turmas: ");
        int totalAlunos = 0;
        
        for (int i = 0; i < turmas; i++) {
            int alunos = l.leNum("alunos na turma: ");
            if (alunos <= 40) {
                totalAlunos += alunos;
            }
        }
        
        double media = totalAlunos / (double) turmas;
        System.out.println("Média: " + media);
    }
}
