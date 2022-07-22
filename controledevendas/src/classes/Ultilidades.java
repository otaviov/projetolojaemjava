
package classes;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Ultilidades {
    // Convertendo o preço no formulario frmProdutos para boolean -- encontrar codigo no botão salvar
    public static boolean isNumericFloat(String NumeroFloat){
        try {
            Float.parseFloat(NumeroFloat);
            return true;
            
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    public static boolean isNumericDouble(String NumeroDouble){
        try {
            Double.parseDouble(NumeroDouble);
            return true;
            
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    // Convertendo Data do formulario frmClientes para String
    public static Date StringtoDate (String Data){
        SimpleDateFormat formatotexto = new SimpleDateFormat("yyyy/MM/dd");
        Date x = null;
        try {
            x = formatotexto.parse(Data);
        } catch (ParseException ex) {
           
        }
        return x;
    }
    
    public static String formatDate(Date Data){
        SimpleDateFormat formatotexto = new SimpleDateFormat ("dd/MM/yyyy");
        return formatotexto.format(Data);
    }

    
}
