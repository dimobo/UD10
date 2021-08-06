package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class APP {

	public static void main(String[] args) {

		AdivinaNumero a = new AdivinaNumero();
		boolean fi = false;
		int cnt = 0, num;

		// Este bucle es el que contara los intentos que hemos necesitado i nos ira
		// pidiendo numeros.
		while (fi == false) {
			num = pedirNumero("Inserte un numero:");
			if (num != 0)
				fi = a.comparar(num);
			cnt++;
			System.out.println("\n");
		}
		System.out.println("Has tardado " + cnt + " En adivinar el numero.");
	}

	// Este metodo es el encargado de pedir el numero al usuario y de lanzar la
	// excepcion en caso de que el valor no sea valido.
	public static int pedirNumero(String text) {
		Scanner s = new Scanner(System.in);
		int num = 0;

		System.out.println(text);
		try {
			num = s.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Valor introducido no válido, has de introducir un numero.");
			return 0;
		}
		return num;

	}

}
