package trabalhosPOO.ATT1.A03.listaPOO1;
import util.Leitor;

public class Ex05 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        double total = 0;
        boolean continuar = true;

        while (continuar) {
            int cod = l.leNum("Código: ");
            int qtd = l.leNum("Quantidade: ");

            double preco = switch (cod) {
                case 100 -> 1.20;
                case 101 -> 1.30;
                case 102 -> 1.50;
                case 103 -> 1.20;
                case 104 -> 1.30;
                case 105 -> 1.00;
                default -> {
                    System.out.println("Código inválido.");
                    yield 0;
                }
            };

            double subTotal = preco * qtd;
            total += subTotal;

            System.out.println("Item: R$ " + subTotal);
            continuar = l.leNum("Outro item? (1=sim, 0=não): ") == 1;
        }

        System.out.println("Total: R$ " + total);
    }
}
