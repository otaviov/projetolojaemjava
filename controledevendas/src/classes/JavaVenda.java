
package classes;

import formularios.frmLogin;

public class JavaVenda {
    
    
    public static void main(String[] args) {
        
        Dados msDados = new Dados();
        
        // 2 chamar a tela de login
        frmLogin miLogin = new frmLogin();
        miLogin.setDados(msDados);
        miLogin.setVisible(true); // fim 2
        
    }
    
}
