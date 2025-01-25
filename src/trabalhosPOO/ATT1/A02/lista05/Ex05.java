package trabalhosPOO.ATT1.A02.lista05;

import util.Leitor;

public class Ex05 {
    public static void main(String[] args) {
        System.out.println("Números de 1 a 20 (um abaixo do outro):");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("\nNúmeros de 1 a 20 (um ao lado do outro):");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
    }
}
