package MyTwitter.model.interfaces;

import MyTwitter.model.tweets.Tweet;
import java.util.Vector;

/**
 * @author felip
 */
public interface IPerfilFrame {
    public void loadPerfil();
    public void addTweet(String usuario, String mensagem);
    public void loadTweets(Vector<String[]> tweets);
}
