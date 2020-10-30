package MyTwitter.model.exceptions;

/**
 * @author felip
 */
public class PIException extends Exception{
	
    private String usuario;
	
    public PIException(String usuario) {
    	super("O Usuário " + usuario + " inexistente");
	this.usuario = usuario;
    }
	
    public String getUsuario() {
	return this.usuario;
    }
}
