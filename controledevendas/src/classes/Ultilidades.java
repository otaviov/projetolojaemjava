
package classes;

import java.text.ParseException;
import java.util.Date;

public class Ultilidades {
    // Convertendo o preço no formulario frmProdutos para boolean -- encontrar codigo no botão salvar
    public static boolean isNumeric(String Numero){
        try {
            Float.parseFloat(Numero);
            return true;
            
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    // Convertendo Data d formulario frmClientes para String
    public static Date StringtoDate (String Data){
        StringDateFormat formatotexto = new StringDateFormat("yyyy/MM/dd");
        Date x = null;
        try {
            x = formatotexto.parse(Data);
        } catch (ParseException ex) {
           
        }
        return x;
    }
    
}
