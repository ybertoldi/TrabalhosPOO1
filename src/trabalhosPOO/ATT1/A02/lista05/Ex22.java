package trabalhosPOO.ATT1.A02.lista05;
import util.Leitor;

public class Ex22 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        
        int totalVotantes = l.leNum("total de votantes: ");
        int[] votos = new int[3];
        
        for (int i = 0; i < totalVotantes; i++) {
            int voto = l.leNum("voto: ");
            if (voto >= 1 && voto <= 3) {
                votos[voto - 1]++;
            }
        }
        
        System.out.println("Candidato 1: " + votos[0]);
        System.out.println("Candidato 2: " + votos[1]);
        System.out.println("Candidato 3: " + votos[2]);
    }
}
