package MyTwitter.model.interfaces;

import MyTwitter.model.exceptions.MFPException;
import MyTwitter.model.exceptions.PDException;
import MyTwitter.model.exceptions.PEException;
import MyTwitter.model.exceptions.PIException;
import MyTwitter.model.exceptions.SIException;
import MyTwitter.model.tweets.Tweet;
import MyTwitter.model.users.Perfil;
import java.util.Vector;

/**
 * @author felip
 */
public interface ITwitter {
    public void criarPerfil(Perfil usuario) throws PEException;
    public void cancelarPerfil(String usuario) throws PIException, PDException;
    public void twittar(String usuario, String mensagem) throws PIException, MFPException;
    public void seguir(String seguidor, String seguido) throws PIException, PDException, SIException;
    public int  numeroSeguidores(String usuario) throws PIException, PDException;
    public Vector<Tweet> timeline(String usuario) throws PIException, PDException;
    public Vector<Tweet> tweets(String usuario) throws PIException, PDException;
    public Vector<Perfil> seguidores(String usuario) throws PIException, PDException;
    public Vector<Perfil> seguidos(String usuario) throws PIException, PDException;
}
