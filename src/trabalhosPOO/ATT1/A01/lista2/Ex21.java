package trabalhosPOO.ATT1.A01.lista2;
import util.Leitor;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Ex21 {
    public static void main(String[] args) {
        Leitor l = new Leitor();
        String data = l.leString("Digite uma data no formato dd/MM/aaaa:");

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate dataFormatada = LocalDate.parse(data, formato);
            System.out.println("A data " + data + " é válida.");
        } catch (DateTimeParseException e) {
            System.out.println("A data " + data + " é inválida.");
        }
    }
}
