package trabalhosPOO.ATT1.A02.lista05;

import util.Leitor;

public class Ex02 {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        String nome, senha;

        do {
            nome = leitor.leString("nome:");
            senha = leitor.leString("senha:");
            if (senha.equals(nome)) {
                System.out.println("Inválido. Tente novamente.");
            }
        } while (senha.equals(nome));

        System.out.println("Usuário e senha válidos.");
    }
}
