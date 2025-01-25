package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex08 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int tamanho = l.leNum("Tamanho da senha: ");

        while (tamanho >= alfabeto.length) {
            System.out.println("Tamanho inválido. Tente novamente.");
            tamanho = l.leNum("Tamanho da senha: ");
        }

        StringBuilder senha = new StringBuilder();
        for (int i = 0; i < tamanho - 1; i += 2) {
            char consoante = getConsoante(alfabeto);
            char vogal = getVogal(alfabeto);
            senha.append(consoante).append(vogal);
        }

        if (tamanho % 2 != 0) {
            senha.append(getConsoante(alfabeto));
        }

        System.out.println("Senha gerada: " + senha);
    }

    private static char getConsoante(char[] alfabeto) {
        String consoantes = "bcdfghjklmnpqrtstvwxz";
        return consoantes.charAt((int)(Math.random() * consoantes.length()));
    }

    private static char getVogal(char[] alfabeto) {
        String vogais = "aeiou";
        return vogais.charAt((int)(Math.random() * vogais.length()));
    }
}
