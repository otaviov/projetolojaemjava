package classes;

public class Dados {

    private int maxUsu = 50;
    // Criando usuarios
    private Usuario msUsuarios[] = new Usuario[maxUsu];
    private int conUsu = 0;

    public Dados() {
        Usuario mUsuario = new Usuario("adm", "adm1", "adm2", "123", 1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
    }
    
    public int numeroUsuarios(){
        return conUsu;
    }

    public Usuario[] getUsuarios() {
        return msUsuarios;
    }

    public boolean validarUsuario(String usuario, String senha) {

        boolean aux = false;
        for (int i = 0; i < conUsu; i++) {
            if (msUsuarios[i].getIdUsuario().equals(usuario)
                    && msUsuarios[i].getSenha().equals(senha)) {
                return true;
            }

        }
        return false;

    }

    public int posicaoUsuario(String usuario) {

        for (int i = 0; i < conUsu; i++) {
            if (msUsuarios[i].getIdUsuario().equals(usuario)) {
                return i;
            }

        }
        return -1;

    }

    public String adicionarUsuario(Usuario msUsuario) {
        if (conUsu == maxUsu) {
            return "Não é possível cadastrar mais usuarios (Número Máximo atingido)";
        }

        msUsuarios[conUsu] = msUsuario;
        conUsu++;
        return "Usuário cadastrado com sucesso";
    }

}
