package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex14 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int n = l.leNum("n: ");
        double soma = 0;
        
        for (int i = 1, m = 1; i <= n; i++, m += 2) {
            soma += (double) i / m;
        }
        
        System.out.println("Soma: " + soma);
    }
}
