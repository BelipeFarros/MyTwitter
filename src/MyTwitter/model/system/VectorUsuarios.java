package MyTwitter.model.system;

import MyTwitter.model.exceptions.UJCException;
import MyTwitter.model.exceptions.UNCException;
import MyTwitter.model.interfaces.IRepositorioUsuario;
import MyTwitter.model.users.Perfil;
import MyTwitter.view.MainFrame;
import java.util.Vector;

/**
 * @author felip
 */
public class VectorUsuarios implements IRepositorioUsuario {
	
    private Vector<Perfil> repositorio;
	
    public VectorUsuarios() {
	repositorio = new Vector<>();
    }

    @Override
    public void cadastrar(Perfil usuario) throws UJCException {
	if(buscar(usuario.getUsuario()) == null){
            repositorio.add(usuario);
        } else {
            throw new UJCException(usuario);
        }
    }

    @Override
    public Perfil buscar(String usuario) {
	for(Perfil perfilBuscado : repositorio)
            if(perfilBuscado.getUsuario().equals(usuario)) return perfilBuscado;
	return null;
    }

    @Override
    public void atualizar(Perfil usuario) throws UNCException {
	if(buscar(usuario.getUsuario()) != null){
            MainFrame.twitterController.getPerfilUsuario().setUsuario(usuario.getUsuario());
        } else throw new UNCException(usuario);
    }
    
    public Vector<Perfil> getUsuarios(){
        return repositorio;
    }
}
