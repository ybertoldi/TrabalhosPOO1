package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex26 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        double precoPao = l.leDouble("Preço do pão: ");
        
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - R$ " + (precoPao * i));
        }
    }
}
