package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex09 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int num = l.leNum("numero: ");
        
        System.out.println("Tabuada de " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
