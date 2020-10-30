package MyTwitter.model.exceptions;

import MyTwitter.model.users.Perfil;

/**
 * @author felip
 */
public class PEException extends Exception{
	
    private Perfil usuario;
	
    public PEException(Perfil usuario) {
	super("O Usuário " + usuario.getUsuario() + " já existe");
	this.usuario = usuario;
    }
	
    public Perfil getUsuario() {
	return this.usuario;
    }
}
