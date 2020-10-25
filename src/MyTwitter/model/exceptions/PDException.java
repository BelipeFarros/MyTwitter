/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTwitter.model.exceptions;

/**
 *
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
