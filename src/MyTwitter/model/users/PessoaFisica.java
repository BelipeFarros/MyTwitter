/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTwitter.model.users;

/**
 *
 * @author felip
 */
public class PessoaFisica extends Perfil {
	
    //Atributes ---
    private long cpf;
	
    //Constructor ---
    public PessoaFisica(String usuario, long cpf) {
	super(usuario);
	this.cpf = cpf;
    }

    //Getter and Setter ---
    public long getCpf() {
	return cpf;
    }

    public void setCpf(long cpf) {
    	this.cpf = cpf;
    }	
}
