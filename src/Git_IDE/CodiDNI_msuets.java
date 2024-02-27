package Git_IDE;
import java.util.Scanner;

public class CodiDNI_msuets {

	static final int PREUCREDIT = 134;
	static String nom;
	static String cognom1;
	static String cognom2;
	static int dni;
	static String nif="";
	static String[] assignatures= {"M1","M2","M3"};
	static int numAssignatures=0;
	static int totalMatricula=0;
	
	
	public static void main(String[] args) {
		
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("introdueix el nom: "); 
		nom= sc.nextLine(); //aquest error es dona perquè s'han de declarar totes les variables com estàtiques. Una altra solució és crear i instanciar una classe nova
		
		System.out.println ("introdueix el 1r cognom: "); 
		cognom1= sc.nextLine();
		
		System.out.println ("introdueix el 2n cognom: "); 
		cognom2= sc.nextLine();
		
		System.out.println ("introdueix el dni: "); 
		dni= sc.nextInt();
		
		System.out.println ("En quantes assignatures et vols matricular (1-3): "); 
		numAssignatures= sc.nextInt();
		
		System.out.println("hola "+nom);
		
		//calcul nif
		nif = calculNif(dni);
		System.out.println("el teu nif és: "+dni+nif);
		
		System.out.println("el cost total de la matricula és: "+ 
		numAssignatures*PREUCREDIT+"€");
		
		sc.close();
	}

	public static String calculNif(int dni) {
		String nif;
		String[] taulaNIF= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J",
				"Z","S","Q","V","H","L","C","K","E"};
		@SuppressWarnings("unused")
		String tNIF ="TRWAGMYFPDXBNJZSQVHLCKE";
		
		nif=taulaNIF[dni%23];
		return nif;
	}

}
