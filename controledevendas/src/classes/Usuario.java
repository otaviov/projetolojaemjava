
package classes;


public class Usuario {
    private String idUsuario;
    private String nome;
    private String snome;
    private String senha;
    private String perfil;

    public Usuario(String idUsuario, String nome, String sobrenome, String senha, String tipoacesso) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.snome = sobrenome;
        this.senha = senha;
        this.perfil = tipoacesso;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return snome;
    }

    public void setSobrenome(String sobrenome) {
        this.snome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoacesso() {
        return perfil;
    }

    public void setTipoacesso(String tipoacesso) {
        this.perfil = tipoacesso;
    }
    
    
}
