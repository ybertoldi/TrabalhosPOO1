package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex36 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        int[] votos = new int[7]; // Índices 1 a 6 correspondem aos códigos de voto

        while (true) {
            int v = l.leNum("Voto (0 para encerrar): ");
            if (v == 0) break;
            if (v >= 1 && v <= 6) votos[v]++;
            else System.out.println("Código inválido.");
        }

        int total = votos[1] + votos[2] + votos[3] + votos[4] + votos[5] + votos[6];
        System.out.println("Candidato 1: " + votos[1]);
        System.out.println("Candidato 2: " + votos[2]);
        System.out.println("Candidato 3: " + votos[3]);
        System.out.println("Candidato 4: " + votos[4]);
        System.out.println("Nulos: " + votos[5]);
        System.out.println("Brancos: " + votos[6]);
        System.out.printf("%% Nulos: %.2f%%%n", (votos[5] * 100.0 / total));
        System.out.printf("%% Brancos: %.2f%%%n", (votos[6] * 100.0 / total));
    }
}
