package MyTwitter.model.exceptions;

import MyTwitter.model.users.Perfil;

/**
 * @author felip
 */
public class UNCException extends Exception {
	
    private Perfil usuario;
	
    public UNCException(Perfil usuario) {
	super("O Usuário " + usuario.getUsuario() + " não existe.");
	this.usuario = usuario;
    }
	
    public Perfil getUsuario() {
    	return this.usuario;
    }
}
