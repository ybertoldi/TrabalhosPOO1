package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex12 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int[] idades = new int[5];
        double[] alturas = new double[5];
        int maisVelho = 0, maisNovo = 0, maisAlto = 0, maisBaixo = 0;
        double somaIdades = 0, somaAlturas = 0;

        for (int i = 0; i < 5; i++) {
            idades[i] = l.leNum("Idade da pessoa " + (i + 1) + ": ");
            alturas[i] = l.leDouble("Altura da pessoa " + (i + 1) + ": ");
            somaIdades += idades[i];
            somaAlturas += alturas[i];
        }

        double mediaIdade = somaIdades / 5;
        double mediaAltura = somaAlturas / 5;

        System.out.print("Idades: ");
        for (int idade : idades) {
            System.out.print(idade + " ");
        }

        System.out.print("\nAlturas: ");
        for (double altura : alturas) {
            System.out.print(altura + " ");
        }

        // Ordenando e encontrando os extremos
        for (int i = 1; i < 5; i++) {
            if (idades[i] > idades[maisVelho]) maisVelho = i;
            if (idades[i] < idades[maisNovo]) maisNovo = i;
            if (alturas[i] > alturas[maisAlto]) maisAlto = i;
            if (alturas[i] < alturas[maisBaixo]) maisBaixo = i;
        }

        System.out.println("\nMais velho: " + idades[maisVelho] + " " + alturas[maisVelho]);
        System.out.println("Mais novo: " + idades[maisNovo] + " " + alturas[maisNovo]);
        System.out.println("Mais alto: " + idades[maisAlto] + " " + alturas[maisAlto]);
        System.out.println("Mais baixo: " + idades[maisBaixo] + " " + alturas[maisBaixo]);

        System.out.println("\nIdade média: " + mediaIdade);
        System.out.println("Altura média: " + mediaAltura);
    }
}
