package trabalhosPOO.ATT1.A02.lista07;
import util.Leitor;
import util.ManipuladorArquivos;

public class Ex01 {
    public static void main(String[] args) {
        Leitor l = new Leitor();

        int n = l.leNum("Informe um valor ímpar entre 3 e 11: ");
        while (n < 3 || n > 11 || n % 2 == 0) {
            n = l.leNum("Valor inválido. Informe um valor ímpar entre 3 e 11: ");
        }

        // Criar a matriz quadrada
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = l.leNum("Informe o valor para a posição [" + i + "][" + j + "]: ");
            }
        }

        // Cálculos
        int soma = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, pares = 0, impares = 0;
        int somaDiagPrincipal = 0, somaDiagSecundaria = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int valor = matriz[i][j];
                soma += valor;
                if (valor > maior) maior = valor;
                if (valor < menor) menor = valor;
                if (valor % 2 == 0) pares++;
                else impares++;

                if (i == j) somaDiagPrincipal += valor;
                if (i + j == n - 1) somaDiagSecundaria += valor;
            }
        }

        double media = (double) soma / (n * n);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + String.format("%.2f", media));
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Contagem de pares: " + pares);
        System.out.println("Contagem de ímpares: " + impares);
        System.out.println("Soma da diagonal principal: " + somaDiagPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagSecundaria);

        // Mostrar matriz formatada
        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Salvar e ler dados do arquivo
        ManipuladorArquivos.salvarMatriz("matriz.txt", matriz);
        int[][] matrizLida = ManipuladorArquivos.lerMatriz("matriz.txt", n, n);
    }
}
