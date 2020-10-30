package MyTwitter.model.exceptions;

import MyTwitter.model.users.Perfil;

/**
 * @author felip
 */
public class UJCException extends Exception {
	
    private Perfil usuario;
	
    public UJCException(Perfil usuario) {
	super("O Usuário " + usuario.getUsuario() + " já está cadastrado");
	this.usuario = usuario;
    }
	
    public Perfil getUsuario() {
	return this.usuario;
    }
}

