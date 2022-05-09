package classes;

public class Dados {

    private int maxUsu = 50;
    // Criando usuarios
    private Usuario msUsuarios[] = new Usuario[maxUsu];
    private int conUsu = 0;

    public Dados() {
        //Criando usuarios manuais
        Usuario mUsuario;
        mUsuario = new Usuario("adm", "adm1", "adm2", "123", 1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        
        mUsuario = new Usuario("adm1", "adm1", "adm2", "123", 2);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        
        mUsuario = new Usuario("adm2", "adm1", "adm2", "123", 2);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        
        mUsuario = new Usuario("adm3", "adm1", "adm2", "123", 1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        
    }

    public int numeroUsuarios() {
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

    public String adicionarUsuario(Usuario mUsuario) {
        if (conUsu == maxUsu) {
            return "Não é possível cadastrar mais usuarios (Número Máximo atingido)";
        }

        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        return "Usuário cadastrado com sucesso";
    }

    public String editarUsuario(Usuario mUsuario, int pos) {
        msUsuarios[pos].setNome(mUsuario.getNome());
        msUsuarios[pos].setSnome(mUsuario.getSnome());
        msUsuarios[pos].setPerfil(mUsuario.getPerfil());
        msUsuarios[pos].setSenha(mUsuario.getSenha());

        return "Usuario editado com sucesso";
    }

    public String adicionarUsuario(Usuario mUsuario, int pos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String editarUsuario(Usuario mUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
