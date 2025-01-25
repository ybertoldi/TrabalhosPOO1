package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex11 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int pares = 0, impares = 0;
        
        for (int i = 0; i < 10; i++) {
            int num = l.leNum("num: ");
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}
