package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex25 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        System.out.println("Lojas Quase Dois - Tabela de preços");
        
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - R$ " + (1.99 * i));
        }
    }
}
