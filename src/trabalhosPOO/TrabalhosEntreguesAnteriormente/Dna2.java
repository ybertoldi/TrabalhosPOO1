package trabalhosPOO.TrabalhosEntreguesAnteriormente;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Dna2 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		final String ENTRADA = "C:\\Users\\Yuri\\eclipse-workspace\\ExercíciosDePOO\\src\\trabalho\\dna.txt";
		final String SAIDA = "C:\\Users\\Yuri\\eclipse-workspace\\ExercíciosDePOO\\src\\trabalho\\dnaDup.txt";
		
		ManipuladorArquivo manipulador = new ManipuladorArquivo(ENTRADA);
		manipulador.abreArquivo();
		manipulador.analisaArquivo(); //calcula a qtd total de linhas, linhas validas, linhas invalidas e indice das invalidas
		
		manipulador.inicializaEscritor(SAIDA);
		manipulador.escreveArquivo();
		
		System.out.println("O total de fitas : " + manipulador.getQuantFita() );
		System.out.println("O total de fitas validas: " + manipulador.getQuantFitaVal() );
		System.out.println("O total de fitas invalidas: " + manipulador.getQuantFitaInv() );
		System.out.println("Linhas invalidas: " + manipulador.getIndicesDosErrados() );
		
		manipulador.fecha();
	}
}
