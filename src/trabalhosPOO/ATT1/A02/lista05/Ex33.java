package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex33 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        double div = l.leDouble("Dívida: ");
        int[] parcelas = {1, 3, 6, 9, 12};
        double[] juros = {0, 10, 15, 20, 25};

        System.out.println("Dívida   Juros   Parcelas   Valor Parcela");
        for (int i = 0; i < parcelas.length; i++) {
            double valJuros = div * juros[i] / 100;
            double valTotal = div + valJuros;
            double valParcela = valTotal / parcelas[i];
            System.out.printf("R$ %.2f R$ %.2f %d R$ %.2f%n", valTotal, valJuros, parcelas[i], valParcela);
        }
    }
}
