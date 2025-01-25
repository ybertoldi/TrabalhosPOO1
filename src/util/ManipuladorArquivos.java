package util;
import java.io.*;
import java.util.List;

public class ManipuladorArquivos {

    public static void salvarArquivo(String nomeArquivo, List<String> dados) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (String linha : dados) {
                writer.write(linha);
                writer.newLine();
            }
            System.out.println("Dados salvos em " + nomeArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> lerArquivo(String nomeArquivo) {
        List<String> linhas = new java.util.ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                linhas.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linhas;
    }

    public static void salvarMatriz(String nomeArquivo, int[][] matriz) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    writer.write(matriz[i][j] + " ");
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void salvarMatrizDouble(String nomeArquivo, double[][] matriz) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    writer.write(matriz[i][j] + " ");
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[][] lerMatriz(String nomeArquivo, int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            int i = 0;
            while ((linha = reader.readLine()) != null && i < linhas) {
                String[] valores = linha.split(" ");
                for (int j = 0; j < colunas; j++) {
                    matriz[i][j] = Integer.parseInt(valores[j]);
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matriz;
    }

    public static double[][] lerMatrizDouble(String nomeArquivo, int linhas, int colunas) {
        double[][] matriz = new double[linhas][colunas];
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            int i = 0;
            while ((linha = reader.readLine()) != null && i < linhas) {
                String[] valores = linha.split(" ");
                for (int j = 0; j < colunas; j++) {
                    matriz[i][j] = Double.parseDouble(valores[j]);
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matriz;
    }
}
