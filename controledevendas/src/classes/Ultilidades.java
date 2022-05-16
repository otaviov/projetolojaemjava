
package classes;

public class Ultilidades {
    public static boolean isNumeric(String Numero){
        try {
            Float.parseFloat(Numero);
            return true;
            
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
