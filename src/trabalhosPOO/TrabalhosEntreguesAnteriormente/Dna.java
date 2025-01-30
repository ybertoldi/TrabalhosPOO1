package trabalhosPOO.TrabalhosEntreguesAnteriormente;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class Dna {
	
	
	public static boolean fitaValida (String fita) {
		for (char c : fita.toCharArray()) {
			if (c != 'G' && c != 'A' && c != 'T' && c != 'C') {
				return false;
			} 
		}
		
		return true;
	}
	
	public static String copiaDna (String fita) {
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
	
	
	public static boolean fitaValRegex(String fita) {
		return fita.matches("[GATC]+");
	}
	
	public static String copiaDnaRegex(String fita) {
		return fita.replace('G', 'C').replace('C','G').replace('T', 'A').replace('A', 'T');
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		int quantFitaInv = 0, quantFitaVal = 0, quantFita = 0;
		List<Integer> myList = new ArrayList<Integer>();
		
		try {
			
			
			File myObj = new File("C:\\Users\\Yuri\\eclipse-workspace\\ExercíciosDePOO\\src\\trabalho\\dna.txt");
			PrintWriter writer = new PrintWriter("C:\\Users\\Yuri\\eclipse-workspace\\ExercíciosDePOO\\src\\trabalho\\dnaDup.txt", "UTF-8");
			
			Scanner myReader = new Scanner(myObj);
			System.out.println("uma iteracao pela string, sem regex.");
			String copia;
			
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				
				quantFita++;
				
				if (fitaValRegex(data)) {
					writer.println(copiaDnaRegex(data));
					quantFitaVal++;
					
				} else {
					writer.println("***FITA INVÁLIDA - " + data);
					quantFitaInv++;
					myList.add(quantFita);
				}
				
			}
			myReader.close();
			writer.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		System.out.println("O total de fitas : " + quantFita);
		System.out.println("O total de fitas validas: " + quantFitaVal);
		System.out.println("O total de fitas invalidas: " + quantFitaInv);
		System.out.println("Linhas invalidas: " + myList);
		
	}

}
