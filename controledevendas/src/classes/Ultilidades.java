
package classes;

public class Ultilidades {
    public static boolean isNumeric(String Numero){
        try {
            Integer.parseInt(Numero);
            return true;
            
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
