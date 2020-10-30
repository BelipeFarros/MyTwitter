package MyTwitter.model.exceptions;

/**
 * @author felip
 */
public class SIException extends Exception {

    private String usuario;
	
    public SIException(String usuario) {
	super("É impossível seguir o usuario " + usuario);
	this.usuario = usuario;
    }
	
    public String getUsuario() {
	return this.usuario;
    }
}
