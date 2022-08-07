
package classes;

import formularios.frmLogin;
import classes.Dados;

public class JavaVenda {
    
    
    public static void main(String[] args) {
        
        Dados msDados = new Dados();
        
        Dados_db msDados_db = new Dados_db();
        // 2 chamar a tela de login
        
        frmLogin miLogin = new frmLogin();
        miLogin.setDados(msDados);
        
        miLogin.setDados_db(msDados_db);
        
        miLogin.setVisible(true); // fim 2
        
    }
    
}
