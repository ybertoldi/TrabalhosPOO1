package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex15 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        double soma = 0;
        for (int i = 37, j = 38, m = 1; i > 0; i--, j--, m++) {
            soma += (double) (i * j) / m;
        }
        
        System.out.println("Soma: " + soma);
    }
}
