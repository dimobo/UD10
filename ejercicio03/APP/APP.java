package APP;

import java.util.Random;

import exepciones.MiExcepcion;

public class APP {

	public static void main(String[] args) {
		System.out.println("Generando número aleatorio...");
		int num = generaNum();
		System.out.println("El numero generado es: " + num);

		// Este try catch es el que lanzara la excepcion para indicar si es par o impar.
		try {
			if (num % 2 == 0) {
				throw new MiExcepcion(222);
			} else {
				throw new MiExcepcion(111);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	// Este metodo genera un numero random.
	public static int generaNum() {
		Random r = new Random();
		return r.nextInt((1000 - 0) + 1) + 0;
	}

}
