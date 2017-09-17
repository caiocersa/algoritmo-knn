
package codigos;

import java.util.ArrayList;

public class LogClassParcial {
    public static ArrayList<String> LOG = new ArrayList<>();
 
    
    public static String resumo(){
        String texto = "";
        for (String s : LogClassParcial.LOG) {
            texto = texto + "\n" + s;
        }
        return texto;
    }
    
    public static void limpaLog(){
        LOG = new ArrayList<>();
    }
}
