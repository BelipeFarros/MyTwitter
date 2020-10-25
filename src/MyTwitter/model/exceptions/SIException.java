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
public class SIException extends Exception {

    private static final long serialVersionUID = 1L;
	
    private String usuario;
	
    public SIException(String usuario) {
	super("É impossível seguir o usuario " + usuario);
	this.usuario = usuario;
    }
	
    public String getUsuario() {
	return this.usuario;
    }
}
