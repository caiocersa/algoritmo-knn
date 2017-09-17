/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
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
