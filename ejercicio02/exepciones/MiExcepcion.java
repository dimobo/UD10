package exepciones;

public class MiExcepcion extends Exception {

	// Atributo de la clase.
	private int codigoException;

	// Constructores de la clase.
	public MiExcepcion(int codigoError) {
		super();
		this.codigoException = codigoError;
	}

	public MiExcepcion() {
		super();
	}

	// Metodo propio para mostrar el mensage.
	@Override
	public String getMessage() {
		String mensaje = "";

		switch (codigoException) {
		case 111:
			mensaje = "Excepcion de prueba.";
			break;
		}

		return mensaje;
	}

}
