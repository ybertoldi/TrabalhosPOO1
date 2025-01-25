package util;

import java.util.Scanner;

public class Leitor {
	Scanner sc;
	
	public Leitor() {
		sc = new Scanner(System.in);
	}
	
	public int leNum(String txt) {
		System.out.println(txt);
		return sc.nextInt();
	}
	
	public String leString(String txt) {
		System.out.println(txt);
		return sc.nextLine();
	}
	
	public double leDouble(String txt) {
		System.out.println(txt);
		return sc.nextDouble();
	}
	
}
