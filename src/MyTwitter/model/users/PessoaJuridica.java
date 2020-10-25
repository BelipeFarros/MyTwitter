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
public class PessoaJuridica extends Perfil {

    //Atributes ---
    private long cnpj;
	
    //Constructor ---
    public PessoaJuridica (String usuario, long cnpj) {
	super(usuario);
	this.cnpj = cnpj;
    }
	
    //Getter and Setter ---
    public long getCnpj() {
	return cnpj;
    }

    public void setCnpj(long cnpj) {
    	this.cnpj = cnpj;
    }
}
