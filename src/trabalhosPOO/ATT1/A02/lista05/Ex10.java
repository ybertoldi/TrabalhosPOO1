package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex10 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int base = l.leNum("base: ");
        int expo = l.leNum("expoente: ");
        int resultado = 1;
        
        for (int i = 1; i <= expo; i++) {
            resultado *= base;
        }
        
        System.out.println("Resultado: " + resultado);
    }
}
