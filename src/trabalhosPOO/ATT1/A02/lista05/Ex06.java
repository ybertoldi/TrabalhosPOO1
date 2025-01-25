package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex06 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
