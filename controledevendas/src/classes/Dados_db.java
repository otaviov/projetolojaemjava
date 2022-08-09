package classes;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import formularios.frmUsuarios;


public class Dados_db {

    public Connection cnn;

    public Dados_db() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String db = "jdbc:mysql://localhost/projetovenda";
            cnn = DriverManager.getConnection(db, "root", "");

        } catch (Exception ex) {

            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    // Validadar usuario e senha se est]ao corretas
    public boolean validarUsuario(String usuario, String senha) {

        try {
            String sql = "select (1) from usuarios where idUsuario ='"
                    + usuario + "'and senha ='" + senha + "'";

            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {

            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    //Validar se o usuario é administrador ou usuario comum
    public int getPerfil(String usuario) {
        try {
            String sql = "select idPerfil from usuarios where idUsuario ='"
                    + usuario + "'";

            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                return rs.getInt("idPerfil");
            } else {
                return -1;
            }

        } catch (Exception ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    // Validar se existe usuario na tela de login
    public boolean existeUsuario(String usuario) {
        try {
            String sql = "select (1) from usuarios where idUsuario ='"
                    + usuario + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            //Se exite o usuario
            if (rs.next()) {
                return true;
            }//se não existe o usuario 
            else {
                return false;
            }

        } catch (Exception ex) {

            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    // Adicionanr usuario no Banco de dados local
    public String adicionarUsuario(Usuario mUsuario) {
        // Pegar nome e sobrenome do usuario
        String nomeUsu = frmUsuarios.txtNome.getText();
        String sobrNomeUsu = frmUsuarios.txtsnome.getText();

        try {
            String sql = "insert into usuarios values ('"
                    + mUsuario.getIdUsuario() + "','"
                    + mUsuario.getNome() + "', '"
                    + mUsuario.getSnome() + "', '"
                    + mUsuario.getSenha() + "', "
                    + mUsuario.getPerfil() + " )";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);

            return "Usuário " + nomeUsu + " " + sobrNomeUsu + " cadastrado com sucesso";

        } catch (SQLException ex) {

            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return "Não é possivel cadastrar o usuario " + nomeUsu + " " + sobrNomeUsu;
        }
    }

    // Editar o usuario no banco de dados local
    public String editarUsuario(Usuario mUsuario) {

        // Pegar nome do usuario
        String nomeUsu = frmUsuarios.txtNome.getText();
        String sobrNomeUsu = frmUsuarios.txtsnome.getText();

        try {

            String sql = "update usuarios set "
                    + "nome = '" + mUsuario.getNome() + "', "
                    + "snome = '" + mUsuario.getSnome() + "', "
                    + "senha = '" + mUsuario.getSenha() + "', "
                    + "idPerfil = " + mUsuario.getPerfil() + " "
                    + "where idUsuario = '" + mUsuario.getIdUsuario() + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);

            return "Usuario " + nomeUsu + " " + sobrNomeUsu + " editado com sucesso";
        } catch (SQLException ex) {

            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return "Não é possivel editar o usuario " + nomeUsu + " " + sobrNomeUsu;
        }
    }

    // Deletar o usuario do banco de dados local
    public String deletarUsuario(String usuario) {

        // Pegar nome do usuario
        String nomeUsu = frmUsuarios.txtNome.getText();
        String sobrNomeUsu = frmUsuarios.txtsnome.getText();

        try {
            String sql = "delete from usuarios where idUsuario = '" + usuario + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);

            return "Usuario " + nomeUsu + " " + sobrNomeUsu + " deletado com sucesso";

        } catch (SQLException ex) {

            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return "Algo deu errado, não foi possivel deletar o usuario " + nomeUsu + " " + sobrNomeUsu;
        }
    }

    // metodo para chamar os usuario e mostrar na tabela
    public ResultSet getUsuarios() {

        try {
            String sql = "select * from usuarios";

            Statement st = cnn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                              ResultSet.CONCUR_UPDATABLE);
            return st.executeQuery(sql);

        } catch (SQLException ex) {

            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
   
    
}
