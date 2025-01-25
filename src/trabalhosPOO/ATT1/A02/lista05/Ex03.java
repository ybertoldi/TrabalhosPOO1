package trabalhosPOO.ATT1.A02.lista05;

import util.Leitor;

public class Ex03 {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        String nome;
        int idade;
        double salario;
        char sexo, estCivil;

        do {
            nome = leitor.leString("nome:");
        } while (nome.length() <= 3);

        do {
            idade = leitor.leNum("idade:");
        } while (idade < 0 || idade > 150);

        do {
            salario = leitor.leDouble("salário:");
        } while (salario <= 0);

        do {
            sexo = leitor.leString("sexo:").toLowerCase().charAt(0);
        } while (sexo != 'f' && sexo != 'm');

        do {
            estCivil = leitor.leString("estado civil:").toLowerCase().charAt(0);
        } while ("scvd".indexOf(estCivil) == -1);

        System.out.println("Informações válidas recebidas.");
    }
}