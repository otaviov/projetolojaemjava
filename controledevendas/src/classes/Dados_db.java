package classes;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class Dados_db {

    private Connection cnn;

    public Dados_db() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String db = "jdbc:mysql://localhost/projetovenda";
            cnn = DriverManager.getConnection(db, "root", "");

        } catch (Exception ex) {

            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

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

}
