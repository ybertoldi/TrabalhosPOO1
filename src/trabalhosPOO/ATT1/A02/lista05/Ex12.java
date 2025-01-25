package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex12 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int n = l.leNum("n: ");
        
        int a = 1, b = 1;
        System.out.println(a);
        for (int i = 2; i <= n; i++) {
            System.out.println(b);
            int temp = b;
            b = a + b;
            a = temp;
        }
    }
}
