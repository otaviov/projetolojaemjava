
package classes;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Ultilidades {
    
    //Convertendo em INT
    public static boolean isNumericInt(String NumeroInt){
        try {
            Integer.parseInt(NumeroInt);
            return true;
            
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    // Convertendo o preço no formulario frmProdutos para boolean -- encontrar codigo no botão salvar
    public static boolean isNumericFloat(String NumeroFloat){
        try {
            Float.parseFloat(NumeroFloat);
            return true;
            
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    //Convertendo em double
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
    
    // ---Convertendo objetos---
    // convertendo objeto em int
    public static int objectToInt (Object Obj) {
        int NumInt = Integer.parseInt(objectToString(Obj));
        return NumInt;
    }
    
    public static double objectToDouble (Object Obj){
        String Str = Obj.toString();
        double NumDouble = Double.valueOf(Str).doubleValue();
        return NumDouble;
    }
    
   public static boolean objectToBoolean(Object Obj){
       String CadBool = objectToString(Obj);
       Boolean bool = new Boolean(CadBool);
       return bool;
   }
   
   public static String objectToString(Object Obj){
       String Str = "";
       if (Obj != null){
           Str = Obj.toString();
       }
       return Str;
   }

}
