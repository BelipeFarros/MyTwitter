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

