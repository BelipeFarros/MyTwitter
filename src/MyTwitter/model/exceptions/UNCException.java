/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTwitter.model.exceptions;

import MyTwitter.model.users.Perfil;

/**
 *
 * @author felip
 */
public class UNCException extends Exception {
	
    private static final long serialVersionUID = 1L;
	
    private Perfil usuario;
	
    public UNCException(Perfil usuario) {
	super("O Usuário " + usuario.getUsuario() + " não existe.");
	this.usuario = usuario;
    }
	
    public Perfil getUsuario() {
    	return this.usuario;
    }
}
