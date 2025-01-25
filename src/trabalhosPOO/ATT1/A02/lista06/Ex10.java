package trabalhosPOO.ATT1.A02.lista06;
import util.Leitor;

public class Ex10 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        String data = l.leString("Data (dd/mm/aaaa): ");
        String[] partes = data.split("/");

        if (partes.length == 3) {
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);

            if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano > 0) {
                int[] dataVetor = {dia, mes, ano};
                System.out.println("Data válida: ");
                for (int i : dataVetor) {
                    System.out.print(i + " ");
                }
            } else {
                System.out.println("Data inválida.");
            }
        } else {
            System.out.println("Formato inválido.");
        }
    }
}
