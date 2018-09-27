package usuarios.dto;

/**
 *
 * @author Joaquin
 * @date 04-sep-2018
 * @time 20:17:26
 */
public class UsuarioDTO {

    private int id_usuario;
    private String usuario;
    private String password;

    public UsuarioDTO() {
    }

    public UsuarioDTO(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public UsuarioDTO(String usuario, String paswword) {
        this.usuario = usuario;
        this.password = paswword;
    }

    public UsuarioDTO(int id_usuario, String usuario, String paswword) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.password = paswword;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "id_usuario=" + id_usuario + ", usuario=" + usuario + ", password=" + password + '}';
    }

}
