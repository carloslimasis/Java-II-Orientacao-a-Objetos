
public class ValorInvalidoException extends RuntimeException {

	private static final long serialVersionUID = 419380206131223579L;

	public ValorInvalidoException(double valor) {
		super("Valor invalido: " + valor);
	}
}
