package git_id_arodriguez;

import java.util.Scanner;

public class dni {

	private static final int PREUCREDIT = 134;

	public static void main(String[] args) {
		
		String nom = "";
		String cognom1 = "";
		String cognom2 = "";
		
		int dni=0;
		String nif = "";
		String[] assignatures = {"M1","M2","M3"};
		int numAssignatures=0;
		int totalMatricula = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introdueix nom: ");
		nom = sc.nextLine();
		System.out.println("Introdueix primer cognom: ");
		cognom1 = sc.nextLine();
		System.out.println("Introdueix segon cognom: ");
		cognom2 = sc.nextLine();
		System.out.println("Introdueix el numero de DNI: ");
		dni = sc.nextInt();
		
		
		
		System.out.println("En quantes assignatures et vols matricular (1-3)? ");
		numAssignatures = sc.nextInt();
		
		System.out.println("Hola " + nom);
		
		//Calcul nif
		nif = calculNIF(dni, nif);
		System.out.println("el teu nif es: " + dni + nif);
		
		totalMatricula=numAssignatures*PREUCREDIT;
		System.out.println("el cost total de la matricula és: " + totalMatricula + "€");
		
		
		
		

	}

	private static String calculNIF(int dni, String nif) {
		String[] taulaNIF = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		String tNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
		nif = nif + tNIF.charAt(dni % 23);
		//nif=taulaNIF[dni % 23]
		return nif;
	}

}