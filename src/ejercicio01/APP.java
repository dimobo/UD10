package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class APP {

	public static void main(String[] args) {

		AdivinaNumero a = new AdivinaNumero();
		boolean fi = false;

		while (fi == false) {

			a.comparar(pedirNumero("si"));
		}

	}

	// Este metodo es el encargado de pedir el numero al usuario y de lanzar la
	// excepcion en caso de que el valor no sea valido.
	public static int pedirNumero(String text) {

		Scanner s = new Scanner(System.in);
		int num = 0;

		try {
			System.out.println(text);
			num = s.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido no válido, has de introducir un numero.");
		}

		s.close();
		return num;
	}

}
