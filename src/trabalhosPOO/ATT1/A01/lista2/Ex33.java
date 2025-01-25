package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex33 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        String[] gabarito = {"a", "a", "b", "b", "c", "c", "d", "d", "e", "e"};
        String[] respostas = new String[10];
        int pontuacao = 0;

        for (int i = 0; i < 10; i++) {
            respostas[i] = l.leString("Digite a resposta para a questão " + (i + 1) + ":").toLowerCase();
            if (respostas[i].equals(gabarito[i])) {
                pontuacao++;
            }
            System.out.printf("Q%d: %s : %s%n", i + 1, respostas[i], respostas[i].equals(gabarito[i]) ? "Correto" : "Errada, resposta correta (" + gabarito[i] + ")");
        }  

        System.out.println("Pontuação Final: " + pontuacao);
    }
}
