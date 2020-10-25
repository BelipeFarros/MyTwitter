package MyTwitter.model.users;

import java.util.Vector;
import MyTwitter.model.tweets.Tweet;

/**
 * @author felip
 */
public abstract class Perfil {
	
	//Atributos --- 
	private String usuario;
	private Vector<Perfil> seguidos;
	private	Vector<Perfil> seguidores;
	private Vector<Tweet>  timeline;
	private boolean ativo;
	
	
	//Construtor ---
	public Perfil(String usuario) {
		this.usuario = usuario;
		
		seguidos = new Vector<>();
		seguidores = new Vector<>();
		timeline = new Vector<>();
		this.ativo = true;
	}
	
	//Adders ---
	public void addSeguidos(Perfil usuario) {
		seguidos.add(usuario);
	}
	
	public void addSeguidor(Perfil usuario) {
		seguidores.add(usuario);
	}
	
	public void addTweet(Tweet tweet) {
		timeline.add(tweet);
	}
	
	//Setters ---
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void setAtivo(boolean estado) {
		this.ativo = estado;
	}
	
	//Getters ---
	public String getUsuario() {
		return this.usuario;
	}
	
	public Vector<Perfil> getSeguidos(){
		return seguidos;
	}
	
	public Vector<Perfil> getSeguidores(){
		return seguidores;
	}
	
	public Vector<Tweet> getTimeline(){
		return timeline;
	}
	
	//Booleans ---
	public boolean isAtivo() {
		return this.ativo;
	}
}
