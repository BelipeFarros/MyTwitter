package MyTwitter.controller;

import MyTwitter.model.exceptions.MFPException;
import MyTwitter.model.exceptions.PDException;
import MyTwitter.model.exceptions.PEException;
import MyTwitter.model.exceptions.PIException;
import MyTwitter.model.exceptions.SIException;
import MyTwitter.model.exceptions.UNCException;
import MyTwitter.model.system.MyTwitter;
import MyTwitter.model.system.VectorUsuarios;
import MyTwitter.model.tweets.Tweet;
import MyTwitter.model.users.Perfil;
import MyTwitter.model.users.PessoaFisica;
import MyTwitter.model.users.PessoaJuridica;
import java.util.Vector;

/**
 * @author felip
 */
public class MyTwitterController {
    
    private MyTwitter twitter;
    private VectorUsuarios repositorio = new VectorUsuarios();
    private Perfil perfilUsuario;
    
    public MyTwitterController(){
        twitter = new MyTwitter(repositorio);
        perfilUsuario = null;
    }
    
    public void cadastrar(String usuario, String tipoConta, Long dadoRegistro) throws PEException{
        if(usuario != null && usuario.length() > 0 && dadoRegistro > 0) {
            if(tipoConta.equals("Pessoa Física")){
                PessoaFisica perfilF = new PessoaFisica(usuario, dadoRegistro);
                try{
                    twitter.criarPerfil(perfilF);
                } catch (PEException ex) {
                    throw new PEException(perfilF);
                }
            } else if(tipoConta.equals("Pessoa Juridica")) {
                PessoaJuridica perfilJ = new PessoaJuridica(usuario, dadoRegistro);
                try{
                    twitter.criarPerfil(perfilJ);
                } catch (PEException ex){
                    throw new PEException(perfilJ);
                }
            }
        }//Final de if de validação
    }//Fim do método cadastrar
    
    public void cancelarPerfil(String usuario) throws PIException, PDException{
        if(usuario != null && usuario.length() > 0){
            try{
                twitter.cancelarPerfil(usuario);
            } catch(PIException | PDException ex) {
                throw ex;
            }
        }
    }//Fim do método cancelarPerfil
    
    public int numSeguidores(String username) throws PIException, PDException {
        int numSeguidores = 0;
        if(username != null && username.length() > 0){
            try{
                numSeguidores = twitter.numeroSeguidores(username);
            } catch (PDException | PIException ex){
                throw ex;
            }
        }
        return numSeguidores;
    }
    
    public int numSeguidos(String username) throws PIException, PDException {
        int numSeguidos = 0;
        if(username != null && username.length() > 0){
            try{
                numSeguidos = twitter.numeroSeguidos(username);
            } catch(PDException | PIException ex) {
                throw ex;
            }
        }
        return numSeguidos;
    }
    
    public Vector<String[]> timeline(String usuario) throws PIException, PDException {
        Vector<String[]> tweets = new Vector<>();
        Vector<Tweet> timeline = null; 
       
        try {
            timeline = twitter.timeline(usuario);
        } catch(PIException | PDException ex) {
            throw ex;
        }
        
        for(int i = 0; i < timeline.size(); i++){
            String[] t = new String[2];
            t[0] = timeline.get(i).getUsuario();
            t[1] = timeline.get(i).getMensagem();
            tweets.add(t);
        }
        
        return tweets;
    }
    
    public Vector<String[]> tweets(String usuario) throws PIException, PDException {
        Vector<String[]> tweets = new Vector<>();
        Vector<Tweet> ownTweets = null;
        
        try {
            ownTweets = twitter.tweets(usuario);
        } catch (PIException | PDException ex){
            throw ex;
        }
        
        for(int i = 0; i < ownTweets.size(); i++){
            String[] t = new String[2];
            t[0] = ownTweets.get(i).getUsuario();
            t[1] = ownTweets.get(i).getMensagem();
            tweets.add(t);
        }
        
        return tweets;
    } 
    
    public void twittar(String usuario, String mensagem) throws PIException, MFPException {
        if(usuario != null && usuario.length() > 0 && mensagem != null && mensagem.length() > 0){
            try {
                twitter.twittar(usuario, mensagem);
            } catch(PIException | MFPException ex) {
                throw ex;
            }
        }
    }//Fim do método twittar 
    
    public void seguir(String seguidor, String seguido) throws PIException, PDException, SIException {
        if(seguidor != null && seguidor.length() > 0 && seguido != null && seguido.length() > 0){
            try{
                twitter.seguir(seguidor, seguido);
            } catch(PIException | PDException | SIException ex){
                throw ex;
            }
        }
    } 
    
    public Vector<String> seguidores(String usuario) throws PIException, PDException {
        Vector<String> perfisSeguidores = new Vector<>();
        Vector<Perfil> seguidores = null;
        
        if(usuario != null && usuario.length() > 0){
            try {
                seguidores = twitter.seguidores(usuario);
            } catch(PIException | PDException ex) {
                throw ex;
            }
        }
        
        for(Perfil p : seguidores){
            perfisSeguidores.add(p.getUsuario());
        }
        
        return perfisSeguidores;
    }
    
    public Vector<String> seguidos(String usuario) throws PIException, PDException {
        Vector<String> perfisSeguidos = new Vector<>();
        Vector<Perfil> seguidos = null;
        
        if(usuario != null && usuario.length() > 0){
            try {
                seguidos = twitter.seguidos(usuario);
            } catch(PIException | PDException ex) {
                throw ex;
            }
        }
        
        for(Perfil p : seguidos){
            perfisSeguidos.add(p.getUsuario());
        }
        
        return perfisSeguidos;
    }
    
    public void atualizar(String username) throws UNCException {
        Perfil perfil = perfilUsuario;
        perfil.setUsuario(username);
        try {
            twitter.atualizar(perfil);
        } catch (UNCException ex) {
            throw ex;
        }
    }
    
    //----Getters-n'-Setters----
    
    public Vector<String> getUsuarios(){
        Vector<Perfil> usuarios = repositorio.getUsuarios();
        Vector<String> usuariosValidos = new Vector<>();
        for(Perfil p : usuarios){
            usuariosValidos.add(p.getUsuario());
        }
        return usuariosValidos;
    }//Fim da função getUsuarios
    
    public Vector<String> getUsuarios(boolean s){
        Vector<Perfil> usuarios = repositorio.getUsuarios();
        Vector<String> usuariosValidos = new Vector<>();
        for(Perfil p : usuarios){
            if(p.isAtivo())usuariosValidos.add(p.getUsuario());
        }
        return usuariosValidos;
    }//Fim da função getUsuarios(booelan s)
    
    public void setPerfilUsuario(Perfil perfil){
        this.perfilUsuario = perfil;
    }
    
    public Perfil getPerfilUsuario(){
        return perfilUsuario;
    }
    
    public Perfil getUsuario(String usuario){
        return repositorio.buscar(usuario);
    }
    
}
