package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex13 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int n = l.leNum("num: ");
        int fatorial = 1;
        
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        
        System.out.println("Fatorial: " + fatorial);
    }
}
