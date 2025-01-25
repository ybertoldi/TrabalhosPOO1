package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex11 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        String palavras = l.leString("Palavras (separadas por ;): ");
        String[] vetor = palavras.split(";");

        System.out.print("Vetor: ");
        for (String palavra : vetor) {
            System.out.print(palavra + " ");
        }
    }
}
