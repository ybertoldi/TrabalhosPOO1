package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex29 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int num = l.leNum("Montar a tabuada de: ");
        int comeco = l.leNum("Começar por: ");
        int fim = l.leNum("Terminar em: ");
        
        if (fim < comeco) {
            System.out.println("Erro! Valor final menor que inicial.");
        } else {
            System.out.println("tabuada de " + num + " começando em " + comeco + " e terminando em " + fim + ":");
            for (int i = comeco; i <= fim; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
    }
}
