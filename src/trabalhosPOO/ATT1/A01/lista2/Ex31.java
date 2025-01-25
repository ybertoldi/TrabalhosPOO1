package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex31 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        double pesoMorango = l.leDouble("Digite a quantidade de morangos (em kg):");
        double pesoMaca = l.leDouble("Digite a quantidade de maçãs (em kg):");

        double precoMorango = (pesoMorango <= 5) ? 2.50 : 2.20;
        double precoMaca = (pesoMaca <= 5) ? 1.80 : 1.50;

        double total = (pesoMorango * precoMorango) + (pesoMaca * precoMaca);

        if (pesoMorango + pesoMaca > 8 || total > 25.00) {
            total *= 0.90; // 10% de desconto
        }

        System.out.printf("Valor total a pagar: R$ %.2f%n", total);
    }
}
