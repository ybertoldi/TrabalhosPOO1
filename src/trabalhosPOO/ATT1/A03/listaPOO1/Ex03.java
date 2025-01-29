package trabalhosPOO.ATT1.A03.listaPOO1;
import util.Leitor;

public class Ex03 {
    static double soma(double a, double b) {
        return a + b;
    }

    static double subtrai(double a, double b) {
        return a - b;
    }

    static double multiplica(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Leitor l = new Leitor();
        double x = l.leDouble("n1: ");
        double y = l.leDouble("n2: ");

        System.out.println("Soma: " + soma(x, y));
        System.out.println("Subtração: " + subtrai(x, y));
        System.out.println("Multiplicação: " + multiplica(x, y));
        System.out.println("Divisão: " + divide(x, y));
    }
}
