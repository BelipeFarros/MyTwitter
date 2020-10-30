package MyTwitter.model.exceptions;

/**
 * @author felip
 */
public class PDException extends Exception {
	
    private final String usuario;
	
    public PDException(String usuario) {
	super("O Usuário " + usuario + " já existe");
	this.usuario = usuario;
    }
	
    public String getUsuario() {
	return this.usuario;
    }
}
