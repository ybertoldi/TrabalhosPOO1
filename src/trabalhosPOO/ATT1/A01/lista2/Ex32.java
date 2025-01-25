package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex32 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        String tipoCarne = l.leString("Digite o tipo de carne (File Duplo, Alcatra, Picanha):");
        double quantidade = l.leDouble("Digite a quantidade (em kg):");
        boolean cartaoTabajara = l.leString("Pagamento com cartão Tabajara? (sim/não):").equalsIgnoreCase("sim");

        double precoKg = switch (tipoCarne.toLowerCase()) {
            case "file duplo" -> (quantidade <= 5) ? 4.90 : 5.80;
            case "alcatra" -> (quantidade <= 5) ? 5.90 : 6.80;
            case "picanha" -> (quantidade <= 5) ? 6.90 : 7.80;
            default -> 0;
        };

        double total = precoKg * quantidade;
        double desconto = cartaoTabajara ? total * 0.05 : 0;
        double valorFinal = total - desconto;

        System.out.printf("Tipo de carne: %s%n", tipoCarne);
        System.out.printf("Quantidade: %.2f kg%n", quantidade);
        System.out.printf("Preço total: R$ %.2f%n", total);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f%n", valorFinal);
    }
}
