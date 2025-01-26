package trabalhosPOO.ATT1.A02.lista07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import util.Leitor;
import util.ManipuladorArquivos;

public class Ex05 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int n = l.leNum("Quantas cartelas deseja preencher?");
        int[][] cartelas = new int[n][6];
        Set<Integer> sorteados = new HashSet<>();
        while (sorteados.size() < 6) {
            sorteados.add((int) (Math.random() * 60) + 1);
        }

        for (int i = 0; i < n; i++) {
            Set<Integer> cartela = new HashSet<>();
            while (cartela.size() < 6) {
                cartela.add((int) (Math.random() * 60) + 1);
            }
            int j = 0;
            for (Integer num : cartela) {
                cartelas[i][j++] = num;
            }
            java.util.Arrays.sort(cartelas[i]);
        }

        for (int i = 0; i < n; i++) {
            Set<Integer> acertos = new HashSet<>();
            for (int j = 0; j < 6; j++) {
                if (sorteados.contains(cartelas[i][j])) {
                    acertos.add(cartelas[i][j]);
                }
            }
            System.out.println("Cartela " + (i + 1) + ": " + java.util.Arrays.toString(cartelas[i]) + " - Acertos: " + acertos.size());
        }

        ArrayList<String> dados = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dados.add("Cartela " + (i + 1) + ": " + java.util.Arrays.toString(cartelas[i]));
        }

        ManipuladorArquivos.salvarArquivo("loteria.txt", dados);
        List<String> dadosLidos = ManipuladorArquivos.lerArquivo("loteria.txt");
    }
}
