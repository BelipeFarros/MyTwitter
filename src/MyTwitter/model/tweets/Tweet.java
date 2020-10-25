/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTwitter.model.tweets;

/**
 *
 * @author felip
 */
public class Tweet {
	
	//Atributes
	private String usuario,
		       mensagem;
	
	
	//Getters
	public String getUsuario() {
		return usuario;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	//Setters
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
