package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex20 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int n = l.leNum("quantas notas: ");
        double soma = 0;
        
        for (int i = 0; i < n; i++) {
            double nota = l.leDouble("nota: ");
            soma += nota;
        }
        
        double media = soma / n;
        System.out.println("Média: " + media);
    }
}
