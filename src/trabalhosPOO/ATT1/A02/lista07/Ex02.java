package trabalhosPOO.ATT1.A02.lista07;

import java.util.ArrayList;
import java.util.List;
import util.Leitor;
import util.ManipuladorArquivos;

public class Ex02 {
    public static void main(String[] args) {
        Leitor l = new Leitor();

        // Definir o número de supermercados e produtos
        int produtos = 5;
        double[][] preços = new double[5][produtos];
        for (int i = 0; i < 5; i++) {
            System.out.println("Supermercado " + (i + 1));
            for (int j = 0; j < produtos; j++) {
                preços[i][j] = l.leDouble("Preço do produto " + (j + 1) + ": ");
            }
        }

        // Cálculos
        double somaProduto[] = new double[produtos];
        double somaSupermercado[] = new double[5];
        double menorPreço = Double.MAX_VALUE, maiorPreço = Double.MIN_VALUE;
        double somaTotalSupermercadoMaisBarato = 0, somaTotalSupermercadoMaisCaro = 0;

        for (int i = 0; i < 5; i++) {
            double soma = 0;
            for (int j = 0; j < produtos; j++) {
                somaProduto[j] += preços[i][j];
                soma += preços[i][j];
                if (preços[i][j] < menorPreço) menorPreço = preços[i][j];
                if (preços[i][j] > maiorPreço) maiorPreço = preços[i][j];
            }
            somaSupermercado[i] = soma;
        }

        double mediaProduto[] = new double[produtos];
        for (int i = 0; i < produtos; i++) {
            mediaProduto[i] = somaProduto[i] / 5;
        }

        for (int i = 0; i < 5; i++) {
            if (somaSupermercado[i] == menorPreço) somaTotalSupermercadoMaisBarato = somaSupermercado[i];
            if (somaSupermercado[i] == maiorPreço) somaTotalSupermercadoMaisCaro = somaSupermercado[i];
        }

        System.out.println("Preços por supermercado:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Supermercado " + (i + 1) + ": ");
            for (int j = 0; j < produtos; j++) {
                System.out.print(preços[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Média de preço por produto:");
        for (int i = 0; i < produtos; i++) {
            System.out.println("Produto " + (i + 1) + ": " + mediaProduto[i]);
        }

        System.out.println("Soma de preços por supermercado:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Supermercado " + (i + 1) + ": " + somaSupermercado[i]);
        }

        System.out.println("Total no supermercado mais barato: " + somaTotalSupermercadoMaisBarato);
        System.out.println("Total no supermercado mais caro: " + somaTotalSupermercadoMaisCaro);

        // Salvar e ler dados do arquivo
        ArrayList<String> dados = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            dados.add("Supermercado " + (i + 1) + ": ");
            for (int j = 0; j < produtos; j++) {
                dados.add(preços[i][j] + "");
            }
        }

        ManipuladorArquivos.salvarArquivo("precos.txt", dados);
        List<String> precosLidos = ManipuladorArquivos.lerArquivo("precos.txt");
    }
}
