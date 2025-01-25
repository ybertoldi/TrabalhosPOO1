package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex30 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        double precoAlcool = 1.90, precoGasolina = 2.50;
        String tipoCombustivel = l.leString("Digite o tipo de combustível (A para álcool, G para gasolina):").toUpperCase();
        double litros = l.leDouble("Digite a quantidade de litros vendidos:");

        double precoPorLitro = tipoCombustivel.equals("A") ? precoAlcool : precoGasolina;
        double desconto = (litros <= 20) ? (tipoCombustivel.equals("A") ? 0.03 : 0.04) : (tipoCombustivel.equals("A") ? 0.05 : 0.06);

        double total = litros * precoPorLitro;
        double valorDesconto = total * desconto;
        double valorAPagar = total - valorDesconto;

        System.out.printf("Valor a pagar: R$ %.2f (Desconto: R$ %.2f)%n", valorAPagar, valorDesconto);
    }
}
