package MyTwitter.model.users;

import java.util.Vector;
import MyTwitter.model.tweets.Tweet;

/**
 * @author felip
 */
public abstract class Perfil {
	
    private String usuario;             //Guarda o nome de usuários
    private Vector<Perfil> seguidos;    //Guarda os perfis seguidos pelo perfil
    private Vector<Perfil> seguidores;  //Guarda os perfis seguidoes do perfil
    private Vector<Tweet>  timeline;    //Guarda todos os tweets associados ao perfil
    private boolean ativo;              //Indica o estado de atividade do perfil
	
    //Construtor
    public Perfil(String usuario) {
    	this.usuario = usuario;
		
	seguidos = new Vector<>();
	seguidores = new Vector<>();
	timeline = new Vector<>();
	this.ativo = true;
    }
	
    //Métodos de adição
    public void addSeguidos(Perfil usuario) {
	seguidos.add(usuario);
    }
	
    public void addSeguidor(Perfil usuario) {
	seguidores.add(usuario);
    }
	
    public void addTweet(Tweet tweet) {
    	timeline.add(tweet);
    }
	
    //Getters e Setters
    public void setUsuario(String usuario) {
	this.usuario = usuario;
    }
	
    public void setAtivo(boolean estado) {
	this.ativo = estado;
    }
	
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
	
    public boolean isAtivo() {
    	return this.ativo;
    }
}
