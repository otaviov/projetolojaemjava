package classes;

public class Dados {

    public boolean validarUsuario(String usuario, String senha) {
        if (usuario.equals("") && senha.equals("")) {
            return true;

        } else {
            return false;
        }
    }
}
