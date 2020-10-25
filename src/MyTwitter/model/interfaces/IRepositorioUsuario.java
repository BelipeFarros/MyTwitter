package MyTwitter.model.interfaces;

import MyTwitter.model.exceptions.UJCException;
import MyTwitter.model.exceptions.UNCException;
import MyTwitter.model.users.Perfil;

/**
 * @author felip
 */
public interface IRepositorioUsuario {
    public void cadastrar(Perfil usuario) throws UJCException;
    public Perfil buscar(String usuario);
    public void atualizar(Perfil usuario) throws UNCException;
}
