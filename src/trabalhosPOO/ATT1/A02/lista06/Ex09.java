package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex09 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        String texto = l.leString("Texto: ");
        char[] vetor = texto.toCharArray();

        System.out.print("Vetor: ");
        for (char c : vetor) {
            System.out.print(c + " ");
        }
    }
}
