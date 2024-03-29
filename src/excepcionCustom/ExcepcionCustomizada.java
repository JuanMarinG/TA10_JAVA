package excepcionCustom;

public class ExcepcionCustomizada extends Exception {

	private int codigoExcepcion;
	private final static String MSG1 = "Excepci�n Customizada 1";
	private final static String MSG2 = "Excepci�n Customizada 2";
	private final static String MSG3 = "Excepci�n Customizada 3";
	private final static String MSG_ERROR = "Excepci�n desconocida";
	
	public ExcepcionCustomizada(int codigoExcepcion) {
		super();
		this.codigoExcepcion = codigoExcepcion;
	}

	@Override
	public String getMessage() {
		switch(codigoExcepcion) {
		case 1:
			return MSG1;
		case 2:
			return MSG2;
		case 3:
			return MSG3;
		default:
			return MSG_ERROR;
		}
	}	

}
