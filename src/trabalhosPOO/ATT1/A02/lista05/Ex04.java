package trabalhosPOO.ATT1.A02.lista05;

import util.Leitor;

public class Ex04 {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        int popA, popB, anos = 0;
        double taxaA, taxaB;

        do {
            popA = leitor.leNum("população A:");
        } while (popA <= 0);

        do {
            popB = leitor.leNum("população B:");
        } while (popB <= 0);

        do {
            taxaA = leitor.leDouble("taxa A:");
        } while (taxaA <= 0);

        do {
            taxaB = leitor.leDouble("taxa B:");
        } while (taxaB <= 0);

        while (popA < popB) {
            popA += popA * (taxaA / 100);
            popB += popB * (taxaB / 100);
            anos++;
        }

        System.out.println("Anos para A superar ou igualar B: " + anos);
    }
}
