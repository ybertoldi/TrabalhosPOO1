package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex27 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        while (true) {
            double total = 0;
            int produto = 1;
            
            while (true) {
                double preco = l.leDouble("Produto " + produto + ": ");
                if (preco == 0) break;
                total += preco;
                produto++;
            }
            
            double dinheiro = l.leDouble("Dinheiro: ");
            double troco = dinheiro - total;
            
            System.out.println("Total: R$ " + total);
            System.out.println("Dinheiro: R$ " + dinheiro);
            System.out.println("Troco: R$ " + troco);
            
            int continuar = l.leNum("Deseja continuar? 1 - Sim, 0 - Não: ");
            if (continuar == 0) break;
        }
    }
}
