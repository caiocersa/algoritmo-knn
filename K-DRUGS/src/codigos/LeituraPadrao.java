package codigos;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LeituraPadrao {

	public ArrayList lerArquivo() {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream
                        ("/arquivos/resultadoFinal.txt")));
			String linha;
			ArrayList<Padrao> padroes = new ArrayList<>();

			int j = 0;
			while ((linha = br.readLine()) != null) {
				Padrao pl = new Padrao();

				String[] vetor = new String[30];
				vetor = linha.split(":");

				int i = 0;

				pl.setIdade(Double.parseDouble(vetor[i++]));
				pl.setSexoG1(Integer.parseInt(vetor[i++]));
				pl.setSexoG2(Integer.parseInt(vetor[i++]));
				pl.setGrauInstrucao(Double.parseDouble(vetor[i++]));
				pl.setEtnia0(Integer.parseInt(vetor[i++]));
				pl.setEtnia1(Integer.parseInt(vetor[i++]));
				pl.setEtnia2(Integer.parseInt(vetor[i++]));
				pl.setEtnia3(Integer.parseInt(vetor[i++]));
				pl.setEtnia4(Integer.parseInt(vetor[i++]));
				pl.setEtnia5(Integer.parseInt(vetor[i++]));
				pl.setEtnia6(Integer.parseInt(vetor[i++]));
				pl.setClassificacao(vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+
						":"+vetor[i++]+":"+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"
						+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]);
				padroes.add(pl);

			}
			br.close();
                        return padroes;
			

		} catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro "+e);
			System.out.println("Erro " + e.getMessage());
                        return null;
                        
		}
                
	}
        
        public ArrayList lerArquivoParcial() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream
                        ("/arquivos/resultadoParcial.txt")));
			String linha;
			ArrayList<Padrao> padroes = new ArrayList<>();

			int j = 0;
			while ((linha = br.readLine()) != null) {
				Padrao pl = new Padrao();

				String[] vetor = new String[30];
				vetor = linha.split(":");

				int i = 0;

				pl.setIdade(Double.parseDouble(vetor[i++]));
				pl.setSexoG1(Integer.parseInt(vetor[i++]));
				pl.setSexoG2(Integer.parseInt(vetor[i++]));
				pl.setGrauInstrucao(Double.parseDouble(vetor[i++]));
				pl.setEtnia0(Integer.parseInt(vetor[i++]));
				pl.setEtnia1(Integer.parseInt(vetor[i++]));
				pl.setEtnia2(Integer.parseInt(vetor[i++]));
				pl.setEtnia3(Integer.parseInt(vetor[i++]));
				pl.setEtnia4(Integer.parseInt(vetor[i++]));
				pl.setEtnia5(Integer.parseInt(vetor[i++]));
				pl.setEtnia6(Integer.parseInt(vetor[i++]));
				pl.setClassificacao(vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+
						":"+vetor[i++]+":"+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"
						+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]+":"+vetor[i++]);
				padroes.add(pl);

			}
			br.close();
                        return padroes;
			

		} catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro "+e);
			System.out.println("Erro " + e.getMessage());
                        return null;
                        
		}
                
	}

	public static void main(String[] Args) {
		LeituraPadrao lp = new LeituraPadrao();
		lp.lerArquivo();
	}
}
