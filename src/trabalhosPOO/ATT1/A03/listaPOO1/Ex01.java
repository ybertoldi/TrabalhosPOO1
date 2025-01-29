package trabalhosPOO.ATT1.A03.listaPOO1;
import util.Leitor;

public class Ex01 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        String nome = l.leString("nome: ");
        String sobrenome = l.leString("sobrenome: ");
        System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
    }
}
