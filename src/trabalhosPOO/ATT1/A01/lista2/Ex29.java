package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;

public class Ex29 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int pontos = 0;

        pontos += l.leString("Telefonou para a vítima? (sim/não):").equalsIgnoreCase("sim") ? 1 : 0;
        pontos += l.leString("Esteve no local do crime? (sim/não):").equalsIgnoreCase("sim") ? 1 : 0;
        pontos += l.leString("Mora perto da vítima? (sim/não):").equalsIgnoreCase("sim") ? 1 : 0;
        pontos += l.leString("Devia para a vítima? (sim/não):").equalsIgnoreCase("sim") ? 1 : 0;
        pontos += l.leString("Já trabalhou com a vítima? (sim/não):").equalsIgnoreCase("sim") ? 1 : 0;

        if (pontos == 2) {
            System.out.println("Classificação: Suspeito.");
        } else if (pontos >= 3 && pontos <= 4) {
            System.out.println("Classificação: Cúmplice.");
        } else if (pontos == 5) {
            System.out.println("Classificação: Assassino.");
        } else {
            System.out.println("Classificação: Inocente.");
        }
    }
}
