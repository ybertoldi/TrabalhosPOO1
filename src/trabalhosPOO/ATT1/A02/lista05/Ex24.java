package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex24 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int qtdCDs = l.leNum("quantidade de CDs: ");
        double totalGasto = 0;
        
        for (int i = 0; i < qtdCDs; i++) {
            double valorCD = l.leDouble("valor do CD: ");
            totalGasto += valorCD;
        }
        
        double media = totalGasto / qtdCDs;
        System.out.println("Total gasto: R$ " + totalGasto);
        System.out.println("Média por CD: R$ " + media);
    }
}
