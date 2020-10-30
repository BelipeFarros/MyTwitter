package MyTwitter.model.users;

/**
 * @author felip
 */
public class PessoaJuridica extends Perfil {

    private long cnpj; //Guarda o valor do cnpj da PessoaJuridica
	
    //Construtor
    public PessoaJuridica (String usuario, long cnpj) {
	super(usuario);
	this.cnpj = cnpj;
    }
	
    //Getter e Setter ---
    public long getCnpj() {
	return cnpj;
    }

    public void setCnpj(long cnpj) {
    	this.cnpj = cnpj;
    }
}
