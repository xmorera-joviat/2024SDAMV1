package bguilanya_ide;
import java.util.Scanner;


public class IDE {
	public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);

	       // Demanem el numero de DNI a l'usuari.
	        System.out.print("Introdueixi el número de DNI (sense la lletra): ");
	        int numeroDNI = s.nextInt();

	       // Calculem la lletra del DNI cridant a la funció Lletra.
	        char lletraDNI = Lletra(numeroDNI);

	       // Mostrem la lletra del DNI.
	        System.out.println("La lletra del DNI és: " + lletraDNI);

	       // Tanquem l'Scanner
	        s.close();}


	       // Funció per calcular la lletra del DNI.
	        public static char Lletra(int numeroDNI) {

	       // Creem una cadena amb les lletres associades al DNI.
	        String lletresDNI = "TRWAGMYFPDXBNJZSQVHLCKE";

	       // Calculem el residu de la divisió del número de DNI per 23.
	        int residu = numeroDNI % 23;

	       // Retornem la lletra corresponent al residu a partir de la cadena de lletres.
	        return lletresDNI.charAt(residu);
	            }

}
