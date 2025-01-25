package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex22 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int numero = l.leNum("Digite um número inteiro menor que 1000:");

        if (numero < 0 || numero >= 1000) {
            System.out.println("Número inválido.");
        } else {
            int centenas = numero / 100;
            int dezenas = (numero % 100) / 10;
            int unidades = numero % 10;

            System.out.printf("%d = %d centenas, %d dezenas e %d unidades%n", numero, centenas, dezenas, unidades);
        }
    }
}
