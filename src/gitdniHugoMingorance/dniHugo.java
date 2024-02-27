package gitdniHugoMingorance;

import java.util.Scanner;

public class dniHugo {

	private static final int PREUCREDIT = 134;

	public static void main(String[] args) {
		
		//USUARI
		String nom = "";
		String cognom1 = "";
		String cognom2 = "";
		
		//DADES
		String nif = "";
		int dni = 0;
		
		//ASSIGNATURES
		String[] assignatures = {"M1","M2","M3"};
		int numAssignatures = 0;
		
		int totalMatricula = 0;
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Introdueix el nom: ");
		nom = s.nextLine();
		
		System.out.println("Introdueix el primer cognom: ");
		cognom1 = s.nextLine();
		
		System.out.println("Introdueix el segon cognom: ");
		cognom2 = s.nextLine();
		
		System.out.println("Introdueix el DNI: ");
		dni = s.nextInt();
		
		System.out.println("En quantes assignatures et vols matricular? (1-3): ");
		numAssignatures = s.nextInt();
		
		System.out.printf("Hola %s ", nom);
		
		//Calcul nif
		nif = calculNIF(nif, dni);
		System.out.printf("El teu NIF és: %d%s \n", dni, nif);
		
		System.out.printf("El cost total de la matricula és: %d € ", numAssignatures*PREUCREDIT);
		
		
	}

	private static String calculNIF(String nif, int dni) {
		String[] taulaNif = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		String tNif = "TRWAGMYFPDXBNJZSQVHLCKE";
		//nif=taulaNif[dni % 23]
		nif = nif + tNif.charAt(dni % 23);
		return nif;
	}

}
