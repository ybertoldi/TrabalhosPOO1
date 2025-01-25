package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex18 {
    public static void main(String[] args) {
        Leitor l = new Leitor();

        int lado1 = l.leNum("Digite o primeiro lado do triângulo:");
        int lado2 = l.leNum("Digite o segundo lado do triângulo:");
        int lado3 = l.leNum("Digite o terceiro lado do triângulo:");

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os lados informados não formam um triângulo.");
        }
    }
}
