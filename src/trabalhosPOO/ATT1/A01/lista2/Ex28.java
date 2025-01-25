package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex28 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        double num1 = l.leDouble("Digite o primeiro número:");
        double num2 = l.leDouble("Digite o segundo número:");
        String operacao = l.leString("Digite a operação (+, -, *, /):");

        double resultado = switch (operacao) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> Double.NaN;
        };

        if (Double.isNaN(resultado)) {
            System.out.println("Operação inválida.");
        } else {
            System.out.printf("Resultado: %.2f%n", resultado);
            System.out.println((resultado % 2 == 0 ? "Par" : "Ímpar"));
            System.out.println((resultado >= 0 ? "Positivo" : "Negativo"));
            System.out.println((resultado % 1 == 0 ? "Inteiro" : "Decimal"));
        }
    }
}
