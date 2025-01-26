package trabalhosPOO.ATT1.A02.lista07;

import java.util.ArrayList;
import java.util.List;

import util.Leitor;
import util.ManipuladorArquivos;

public class Ex03 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int n = l.leNum("Quantos alunos?");
        String[] nomes = new String[n];
        double[][] notas = new double[n][2];
        double somaM = 0, maiorM = Double.MIN_VALUE, menorM = Double.MAX_VALUE;
        String maiorN = "", menorN = "";
        String acima = "", abaixo = "";

        for (int i = 0; i < n; i++) {
            nomes[i] = l.leString("Nome do aluno " + (i + 1) + ": ");
            for (int j = 0; j < 2; j++) {
                notas[i][j] = l.leDouble("Nota " + (j + 1) + " de " + nomes[i] + ": ");
            }
        }

        for (int i = 0; i < n; i++) {
            double media = (notas[i][0] + notas[i][1]) / 2;
            somaM += media;
            if (media > maiorM) {
                maiorM = media;
                maiorN = nomes[i];
            }
            if (media < menorM) {
                menorM = media;
                menorN = nomes[i];
            }
        }

        double mediaG = somaM / n;
        for (int i = 0; i < n; i++) {
            double media = (notas[i][0] + notas[i][1]) / 2;
            if (media > mediaG) acima += nomes[i] + " ";
            else abaixo += nomes[i] + " ";
        }

        System.out.println("Média geral da turma: " + mediaG);
        System.out.println("Maior média: " + maiorN + " (" + maiorM + ")");
        System.out.println("Menor média: " + menorN + " (" + menorM + ")");
        System.out.println("Acima da média geral: " + acima);
        System.out.println("Abaixo da média geral: " + abaixo);

        ArrayList<String> dados = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dados.add(nomes[i] + ": " + notas[i][0] + " " + notas[i][1]);
        }

        ManipuladorArquivos.salvarArquivo("notas.txt", dados);
        List<String> dadosLidos = ManipuladorArquivos.lerArquivo("notas.txt");
    }
}
