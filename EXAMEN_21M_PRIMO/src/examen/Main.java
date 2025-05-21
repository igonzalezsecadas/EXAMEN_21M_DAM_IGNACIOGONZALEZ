package examen;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Buenos días Ceinmark, soy Marta Gomez.");
		System.out.println("Introduce un numero para saber si es primo o no: ");
		int num = Integer.parseInt(in.nextLine());
		
		System.out.println("El número no es primo");
		System.out.println("Los divisores del número son: ");
	}
}
