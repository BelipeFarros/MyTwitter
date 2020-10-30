package MyTwitter.model.users;

/**
 * @author felip
 */
public class PessoaFisica extends Perfil {
	
    private long cpf; //Guarda o valor do cpf da PessoaFísica
	
    //Construtor
    public PessoaFisica(String usuario, long cpf) {
	super(usuario);
	this.cpf = cpf;
    }

    //Getter e Setter
    public long getCpf() {
	return cpf;
    }

    public void setCpf(long cpf) {
    	this.cpf = cpf;
    }	
}
