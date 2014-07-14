package inscricao.faces.mngbeans;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.Size;
import utfpr.faces.support.PageBean;

/**
 *
 * @author Wilson
 */
@Named
@SessionScoped
public class LoginBean extends PageBean {
    @Size(min = 3, max = 8)
    private String usuario;
    private String senha;

    public LoginBean() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String loginAction() {
        String action = null;
        if (usuario.equals(senha)) {
            action = "inscricao";
        }
        return action;
    }
}
