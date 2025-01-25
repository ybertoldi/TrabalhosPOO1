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
	
	public int leNum() {
		return sc.nextInt();
	}
	
	public String leString() {
		return sc.nextLine();
	}
	public String leString(String txt) {
		System.out.println(txt);
		return sc.nextLine();
	}
	
}
