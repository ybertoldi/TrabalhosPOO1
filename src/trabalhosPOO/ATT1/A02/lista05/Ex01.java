package trabalhosPOO.ATT1.A02.lista05;

import util.Leitor;

public class Ex01 {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        int nota;
        do {
            nota = leitor.leNum("nota:");
            if (nota < 0 || nota > 10) {
                System.out.println("Inválido. Tente novamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);
    }
}
