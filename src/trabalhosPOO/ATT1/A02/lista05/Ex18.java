package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex18 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int num = l.leNum("num: ");
        boolean primo = true;
        String divisores = "";
        
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                primo = false;
                divisores += i + " ";
            }
        }
        
        if (primo && num > 1) {
            System.out.println("Primo");
        } else {
            System.out.println("Não é primo. Divisores: " + divisores);
        }
    }
}
