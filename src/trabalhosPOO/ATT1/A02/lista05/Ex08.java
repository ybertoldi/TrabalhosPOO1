package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex08 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int num1 = l.leNum("num1: ");
        int num2 = l.leNum("num2: ");
        int soma = 0;
        
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
            soma += i;
        }
        
        System.out.println("Soma: " + soma);
    }
}
