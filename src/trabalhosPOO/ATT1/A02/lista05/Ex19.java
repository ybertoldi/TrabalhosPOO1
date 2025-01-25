package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex19 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int n = l.leNum("n: ");
        int divisoes = 0;
        
        for (int i = 2; i <= n; i++) {
            boolean primo = true;
            for (int j = 2; j <= i / 2; j++) {
                divisoes++;
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
        
        System.out.println("Divisões: " + divisoes);
    }
}
