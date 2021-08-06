package ejercicio01;

import java.util.Random;

public class AdivinaNumero {

	private int num;

	// Solo con este constructor nos vale.
	public AdivinaNumero() {
		Random r = new Random();
		num = r.nextInt((501 - 1) + 1) + 1;
	}

	// Este metodo realizara las comprovaciones del numero
	public boolean comparar(int num) {

		if (this.num == num)
			return true;

		if (this.num < num) {
			System.out.println("El número a adivinar es menor.");
		} else if (this.num > num) {
			System.out.println("El número a adivinar es mayor.");
		}
		return false;
	}

	// Get del numero
	public int getNum() {
		return num;
	}

}
