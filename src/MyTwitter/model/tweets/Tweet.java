package MyTwitter.model.tweets;

/**
 * @author felip
 */
public class Tweet {
    
    private String usuario,     //Guarda o usuário que emitiu o tweet
		   mensagem;    //Guarda a mensagem emitida
	
    //Getters e Setters
    public String getUsuario() {
    	return usuario;
    }
	
    public String getMensagem() {
    	return mensagem;
    }
	
    public void setUsuario(String usuario) {
    	this.usuario = usuario;
    }

    public void setMensagem(String mensagem) {
	this.mensagem = mensagem;
    }	
}
