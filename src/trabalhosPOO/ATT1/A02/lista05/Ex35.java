package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex35 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        double total = 0;

        while (true) {
            int cod = l.leNum("Código (0 para encerrar): ");
            if (cod == 0) break;

            int qtd = l.leNum("Quantidade: ");
            double preco = switch (cod) {
                case 100 -> 1.20;
                case 101 -> 1.30;
                case 102 -> 1.50;
                case 103 -> 1.20;
                case 104 -> 1.30;
                case 105 -> 1.00;
			default -> throw new IllegalArgumentException("Unexpected value: " + cod);
            };

            double sub = preco * qtd;
            total += sub;
            System.out.printf("Item: R$ %.2f%n", sub);
        }

        System.out.printf("Total: R$ %.2f%n", total);
    }
}
