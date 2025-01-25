package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex21 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int n = l.leNum("n: ");
        int somaIdades = 0;
        
        for (int i = 0; i < n; i++) {
            int idade = l.leNum("idade: ");
            somaIdades += idade;
        }
        
        double media = somaIdades / (double) n;
        
        if (media <= 25) {
            System.out.println("Jovem");
        } else if (media <= 60) {
            System.out.println("Adulta");
        } else {
            System.out.println("Idosa");
        }
    }
}
