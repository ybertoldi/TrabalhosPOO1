package trabalhosPOO.TrabalhosEntreguesAnteriormente;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipuladorArquivo {
	//vars de operacao
	private String entrada;
	Scanner scanDados;
	PrintWriter escritor;
	
	//vars de contagem
	private int quantFitaInv, quantFitaVal, quantFita;
	private List<Integer> indicesDosErrados = new ArrayList<Integer>();
	
	
	
	public ManipuladorArquivo (String urlEntrada){
		this.entrada = urlEntrada;		
	}
	
	
	//getters
	public int getQuantFitaInv() {
		return quantFitaInv;
	}

	public int getQuantFitaVal() {
		return quantFitaVal;
	}

	public int getQuantFita() {
		return quantFita;
	}

	public List<Integer> getIndicesDosErrados() {
		return indicesDosErrados;
	}



	//metodos
	public boolean abreArquivo() {
		try {
			scanDados = new Scanner(new File(entrada));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public boolean inicializaEscritor(String urlSaida) {
		try {
			escritor = new PrintWriter(urlSaida, "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public void escreveArquivo() {
		abreArquivo();
		while (scanDados.hasNextLine()) {
			String data = scanDados.nextLine();
			
			if (fitaValida(data)) {
				escritor.println(copiaDna(data));
				
			} else {
				escritor.println("***FITA INVÁLIDA - " + data);
			}
			
		}
	}
	
	public void analisaArquivo(){
		quantFitaInv = quantFitaVal = quantFita = 0;
		indicesDosErrados.clear();
		
		while (scanDados.hasNextLine()) {
			String data = scanDados.nextLine();
			quantFita++;
			
			if (fitaValida(data)) {
				quantFitaVal++;
				
			} else {
				quantFitaInv++;
				indicesDosErrados.add(quantFita);
			}
		}
		scanDados.reset();
		
	}
	
	public boolean fitaValida (String fita) {
		for (char c : fita.toCharArray()) {
			if (c != 'G' && c != 'A' && c != 'T' && c != 'C') {
				return false;
			} 
		}
		
		return true;
	}
	
	public String copiaDna (String fita) {
		String fitaDup = "";
		
		for (char c : fita.toCharArray()) {
			if (c == 'G') 
				fitaDup += 'C';
			else if (c == 'C')
				fitaDup += 'G';
			else if (c == 'T')
				fitaDup += 'A';
			else 
				fitaDup += 'T';
				
		}
		return fitaDup;
	}
	
	public void fecha() {
		scanDados.close();
		escritor.close();
	}
}
