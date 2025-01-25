package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex30 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int codigo, maisAlto = 0, maisBaixo = 0, maisGordo = 0, maisMagro = 0;
        double alturaMaisAlta = 0, alturaMaisBaixa = Double.MAX_VALUE, pesoMaisGordo = 0, pesoMaisMagro = Double.MAX_VALUE;
        double somaAlturas = 0, somaPesos = 0;
        int totalClientes = 0;
        
        while (true) {
            codigo = l.leNum("Código (0 para encerrar): ");
            if (codigo == 0) break;
            
            double altura = l.leDouble("Altura: ");
            double peso = l.leDouble("Peso: ");
            
            somaAlturas += altura;
            somaPesos += peso;
            totalClientes++;
            
            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                maisAlto = codigo;
            }
            
            if (altura < alturaMaisBaixa) {
                alturaMaisBaixa = altura;
                maisBaixo = codigo;
            }
            
            if (peso > pesoMaisGordo) {
                pesoMaisGordo = peso;
                maisGordo = codigo;
            }
            
            if (peso < pesoMaisMagro) {
                pesoMaisMagro = peso;
                maisMagro = codigo;
            }
        }
        
        System.out.println("Mais alto: " + maisAlto + " Altura: " + alturaMaisAlta);
        System.out.println("Mais baixo: " + maisBaixo + " Altura: " + alturaMaisBaixa);
        System.out.println("Mais gordo: " + maisGordo + " Peso: " + pesoMaisGordo);
        System.out.println("Mais magro: " + maisMagro + " Peso: " + pesoMaisMagro);
        System.out.println("Média de altura: " + (somaAlturas / totalClientes));
        System.out.println("Média de peso: " + (somaPesos / totalClientes));
    }
}
