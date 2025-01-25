package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex37 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        String[] gabarito = {"A", "B", "C", "D", "E", "E", "D", "C", "B", "A"};
        int maior = 0, menor = 10, totalAlunos = 0, somaNotas = 0;

        while (true) {
            int acertos = 0;
            for (int i = 0; i < 10; i++) {
                String resp = l.leString("Q" + (i + 1) + ": ").toUpperCase();
                if (resp.equals(gabarito[i])) acertos++;
            }

            maior = Math.max(maior, acertos);
            menor = Math.min(menor, acertos);
            somaNotas += acertos;
            totalAlunos++;

            String cont = l.leString("Outro aluno? (S/N): ").toUpperCase();
            if (cont.equals("N")) break;
        }

        System.out.println("Maior acerto: " + maior);
        System.out.println("Menor acerto: " + menor);
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.printf("Média da turma: %.2f%n", (somaNotas * 1.0 / totalAlunos));
    }
}
