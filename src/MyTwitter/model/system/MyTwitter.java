package MyTwitter.model.system;

import MyTwitter.model.exceptions.MFPException;
import MyTwitter.model.exceptions.PDException;
import MyTwitter.model.exceptions.PEException;
import MyTwitter.model.exceptions.PIException;
import MyTwitter.model.exceptions.SIException;
import MyTwitter.model.exceptions.UJCException;
import MyTwitter.model.exceptions.UNCException;
import MyTwitter.model.interfaces.IRepositorioUsuario;
import MyTwitter.model.interfaces.ITwitter;
import MyTwitter.model.tweets.Tweet;
import MyTwitter.model.users.Perfil;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felip
 */
public class MyTwitter implements ITwitter {
	
    private IRepositorioUsuario repositorio;
    
    public MyTwitter(IRepositorioUsuario repositorio) {
	this.repositorio = repositorio;
    }
	
    @Override
    public void criarPerfil(Perfil usuario) throws PEException{
	try {
            repositorio.cadastrar(usuario);
	} catch(UJCException e) {
            throw new PEException(usuario);
	}
    }

    @Override
    public void cancelarPerfil(String usuario) throws PIException, PDException {
	Perfil perfilProcurado = repositorio.buscar(usuario);
	if(perfilProcurado != null) {
            if(perfilProcurado.isAtivo()) perfilProcurado.setAtivo(false);
            else throw new PDException(usuario);
	} else throw new PIException(usuario);
    }

    @Override
    public void twittar(String usuario, String mensagem) throws PIException, MFPException {
	Perfil perfilEmissor = repositorio.buscar(usuario);
	if(perfilEmissor != null && perfilEmissor.isAtivo()) {
            if(mensagem.length() >= 1 && mensagem.length() <= 140) {
		Tweet tweet = new Tweet();
		tweet.setUsuario(usuario);
		tweet.setMensagem(mensagem);
		perfilEmissor.addTweet(tweet);
		for(Perfil p : perfilEmissor.getSeguidores())
                    if(p.isAtivo()) p.addTweet(tweet);
            } else throw new MFPException();
        } else throw new PIException(usuario);
    }

    @Override
    public void seguir(String seguidor, String seguido) throws PIException, PDException, SIException {
    	Perfil perfilSeguidor = repositorio.buscar(seguidor);
    	Perfil perfilSeguido  = repositorio.buscar(seguido);
        
	if(perfilSeguido != null && perfilSeguidor != null) {
            if(perfilSeguido.isAtivo() && perfilSeguidor.isAtivo()) {
		if(!perfilSeguido.getUsuario().equals(perfilSeguidor.getUsuario())) {
                    perfilSeguido.addSeguidor(perfilSeguidor);
                    perfilSeguidor.addSeguidos(perfilSeguido);
		} else throw new SIException(seguido);
            } else throw new PDException(seguidor); 
	} else throw new PIException(seguidor);
    }

    @Override
    public int numeroSeguidores(String usuario) throws PIException, PDException {
	Perfil perfil = repositorio.buscar(usuario);
	if(perfil != null) {
            if(perfil.isAtivo()) {
		int numSeguidores = 0;
		for(Perfil p : perfil.getSeguidores()) 
                    if(p.isAtivo()) numSeguidores++;
                return numSeguidores;
            } else throw new PDException(usuario);
	} else throw new PIException(usuario);
    }
    
    public int numeroSeguidos(String usuario) throws PIException, PDException {
        Perfil perfil = repositorio.buscar(usuario);
        if(perfil != null){
            if(perfil.isAtivo()){
                int numSeguidos = 0;
                for(Perfil p : perfil.getSeguidos())
                    if(p.isAtivo()) numSeguidos++;
                return numSeguidos;
            } else throw new PDException(usuario);
        } else throw new PIException(usuario);
    }

    @Override
    public Vector<Tweet> timeline(String usuario) throws PIException, PDException {
	Perfil perfil = repositorio.buscar(usuario);
	if(perfil != null) {
            if(perfil.isAtivo()) return perfil.getTimeline();
            else throw new PDException(usuario);
	} else throw new PIException(usuario);
    }

    @Override
    public Vector<Tweet> tweets(String usuario) throws PIException, PDException {
	Perfil perfil = repositorio.buscar(usuario);
	if(perfil != null) {
            if(perfil.isAtivo()) {
		Vector<Tweet> tweetsPerfil = new Vector<>();
		for(Tweet t : perfil.getTimeline())
                    if(t.getUsuario().equals(usuario)) tweetsPerfil.add(t);
		return tweetsPerfil;
            } else throw new PDException(usuario);
	} else throw new PIException(usuario);
    }

    @Override
    public Vector<Perfil> seguidores(String usuario) throws PIException, PDException{
	Perfil perfil = repositorio.buscar(usuario);
	if(perfil != null) {
            if(perfil.isAtivo()) {
		Vector<Perfil> perfisValidos = new Vector<>();
		for(Perfil p : perfil.getSeguidores())
                    if(p.isAtivo()) perfisValidos.add(p);
		return perfisValidos;
            } else throw new PDException(usuario);
	} else throw new PIException(usuario);
    }

    @Override
    public Vector<Perfil> seguidos(String usuario) throws PIException, PDException {
	Perfil perfil = repositorio.buscar(usuario);
	if(perfil != null) {
            if(perfil.isAtivo()) {
		Vector<Perfil> perfisValidos = new Vector<>();
               	for(Perfil p : perfil.getSeguidos())
                    if(p.isAtivo()) perfisValidos.add(p);
                return perfisValidos;
            } else throw new PDException(usuario);
    	} else throw new PIException(usuario);
    }
    
    public void atualizar(Perfil usuario) throws UNCException{
        try {
            repositorio.atualizar(usuario);
        } catch (UNCException ex) {
            throw ex;
        } 
    }
}
