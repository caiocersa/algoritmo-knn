package codigos;

import java.util.ArrayList;
import java.util.Collections;

public class Log {
    public static ArrayList<String> LOG = new ArrayList<>();
 
    
    public static String resumo(){
        String texto = "";
        for (String s : Log.LOG) {
            texto = texto + "\n" + s;
        }
        return texto;
    }
    
    public static void limpaLog(){
        LOG = new ArrayList<>();
    }
}