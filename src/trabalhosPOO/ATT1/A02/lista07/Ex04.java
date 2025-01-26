package trabalhosPOO.ATT1.A02.lista07;

import java.util.ArrayList;
import java.util.List;

import util.Leitor;
import util.ManipuladorArquivos;

public class Ex04 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int n = l.leNum("Quantos atletas?");
        double[][] saltos = new double[n][5];
        double[] medias = new double[n];
        double maiorM = Double.MIN_VALUE, menorM = Double.MAX_VALUE;
        String melhor = "", pior = "";

        for (int i = 0; i < n; i++) {
            System.out.println("Atleta " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                saltos[i][j] = l.leDouble("Salto " + (j + 1) + ": ");
            }
        }

        for (int i = 0; i < n; i++) {
            double soma = 0, menor = Double.MAX_VALUE;
            for (int j = 0; j < 5; j++) {
                soma += saltos[i][j];
                if (saltos[i][j] < menor) menor = saltos[i][j];
            }
            medias[i] = (soma - menor) / 4;
            if (medias[i] > maiorM) {
                maiorM = medias[i];
                melhor = "Atleta " + (i + 1);
            }
            if (medias[i] < menorM) {
                menorM = medias[i];
                pior = "Atleta " + (i + 1);
            }
        }

        System.out.println("Melhor média: " + melhor + " (" + maiorM + ")");
        System.out.println("Pior média: " + pior + " (" + menorM + ")");
        for (int i = 0; i < n; i++) {
            System.out.print("Atleta " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(saltos[i][j] + " ");
            }
            System.out.println("Média: " + medias[i]);
        }

        ArrayList<String> dados = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dados.add("Atleta " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                dados.add(saltos[i][j] + "");
            }
            dados.add("Média: " + medias[i]);
        }

        ManipuladorArquivos.salvarArquivo("saltos.txt", dados);
        List<String> dadosLidos = ManipuladorArquivos.lerArquivo("saltos.txt");
    }
}
