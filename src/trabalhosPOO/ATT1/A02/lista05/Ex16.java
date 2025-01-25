package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex16 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int n = l.leNum("quantidade de números: ");
        int menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, soma = 0;
        
        for (int i = 0; i < n; i++) {
            int num = l.leNum("num: ");
            if (num < menor) menor = num;
            if (num > maior) maior = num;
            soma += num;
        }
        
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
        System.out.println("Soma: " + soma);
    }
}
