import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BoletinUD8_B1 {
	//Hola caracola :)
	public static void main(String[] args) {
		File f = new File("./Documentos/numeros.txt");
		
		try(Scanner leer = new Scanner(f)){
			int max = leer.nextInt();
			int min = leer.nextInt();
			int numero;
			
			while(leer.hasNextInt()) {
				numero = leer.nextInt();
				
				if(numero > max) {
					max = numero;
				}else if (numero < min) {
					min = numero;
				}
			}
			
			leer.close();
			
			System.out.println("Número máximo: " + max);
			System.out.println("Número mínimo: " + min);
			
		}catch(FileNotFoundException e) {
			System.err.println("El archivo no existe.");
		}catch(NumberFormatException e) {
			System.err.println("Error. Elemento no numérico.");
		}

	}

}
