package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex28 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        double menor = Double.MAX_VALUE, maior = Double.MIN_VALUE, soma = 0;
        int n = 0;
        
        while (true) {
            double temp = l.leDouble("Temperatura: ");
            if (temp == -1) break;
            
            soma += temp;
            n++;
            
            if (temp < menor) menor = temp;
            if (temp > maior) maior = temp;
        }
        
        double media = soma / n;
        
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Média das temperaturas: " + media);
    }
}
