package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex19 {
    public static void main(String[] args) {
        Leitor l = new Leitor();

        double a = l.leDouble("Digite o valor de A:");
        if (a == 0) {
            System.out.println("A equação não é de segundo grau.");
            return;
        }

        double b = l.leDouble("Digite o valor de B:");
        double c = l.leDouble("Digite o valor de C:");

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
        }
    }
}
