package codigos;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;

public class ClassificadorParcial {
    ArrayList<Padrao> BASE = new ArrayList<Padrao>();
    
    public ClassificadorParcial (){
        LeituraPadrao lp = new LeituraPadrao();
        BASE = lp.lerArquivoParcial();
    }
    
    public String classifica (Padrao p){
        Log.limpaLog();
        NumberFormat formatter = new DecimalFormat("#0.00");
        Log.LOG.add("Calculando distância...");
        for (int x = 0;  x < BASE.size() ; x++){
            double distancia = Math.sqrt(Math.pow((p.getIdade()- BASE.get(x).getIdade()),2) +
                               Math.pow((p.getSexoG1()- BASE.get(x).getSexoG1()),2) +
                               Math.pow((p.getSexoG2()- BASE.get(x).getSexoG2()),2) +
                               Math.pow((p.getGrauInstrucao()- BASE.get(x).getGrauInstrucao()),2) +
                               Math.pow((p.getEtnia0()- BASE.get(x).getEtnia0()),2) +
                               Math.pow((p.getEtnia1()- BASE.get(x).getEtnia1()),2) +
                               Math.pow((p.getEtnia2()- BASE.get(x).getEtnia2()),2) +
                               Math.pow((p.getEtnia3()- BASE.get(x).getEtnia3()),2) +
                               Math.pow((p.getEtnia4()- BASE.get(x).getEtnia4()),2) +
                               Math.pow((p.getEtnia5()- BASE.get(x).getEtnia5()),2) +
                               Math.pow((p.getEtnia6()- BASE.get(x).getEtnia6()),2));
            Log.LOG.add("Dado da Base [ "+ x +"], Distancia = "+formatter.format(distancia));     
            BASE.get(x).setDistancia(distancia);   
        }
        
        Collections.sort(BASE);
 
        String classificacaoFinal = "";
        for (int x = 0; x < 20; x++){
            ArrayList<String> valores = new ArrayList<>();
            for (int y = 0 ; y<9; y++) {
                String[] t = BASE.get(y).getClassificacao().split(":");           
                valores.add(t[x]);
            }
             classificacaoFinal += contador(valores) + ":";
        }
        
        
        return classificacaoFinal;
    }

    public String contador(ArrayList<String> lista) {
        //TIRAR REPETICAO
        ArrayList<String> semRepeticao = new ArrayList<>();
        for (String s : lista) {
            if (!existe(s, semRepeticao)) semRepeticao.add(s);
        }
        
        int[] listaCont = new int[semRepeticao.size()];
        
        for (String s : lista) {
            
            listaCont[getPosicao(s, semRepeticao)]++;
        }
        
        int posMaiorValor = 0;
        for (int p = 1; p < listaCont.length; p++) {
            if (listaCont[p] > listaCont[posMaiorValor]) posMaiorValor = p; 
        }
        
        return lista.get(posMaiorValor);
    }
    
    public boolean existe(String s, ArrayList<String> lista) {
        boolean existe = false;
        for (String sAux : lista) if (sAux.equals(s)) existe = true;
        
        return existe;
    }
    
    public int getPosicao(String s, ArrayList<String> lista) {
        for (int i = 0; i<lista.size(); i++) {
            if (lista.get(i).equals(s)) return i;
        }
        return -1;
    }
}
