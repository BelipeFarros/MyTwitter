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
