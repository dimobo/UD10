package APP;

import exepciones.MiExcepcion;

public class APP {
	
	public static void main(String[] args) {
		try {
			System.out.println("Mensaje mostrado por pantalla.");
			throw new MiExcepcion(111);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Programa terminado.");
	}

}
