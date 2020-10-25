/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTwitter.model.exceptions;

/**
 *
 * @author felip
 */
public class MFPException extends Exception{
    
    public MFPException() {
        super("O tamanho da mensagem está fora do intervalo esperado de 1 a 140 caracteres");
    }
    
}
