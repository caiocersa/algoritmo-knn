import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Normalizador {

	public void normaliza() {
		try {

			File file = new File("resultadoFinal.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			FileReader arquivo = new FileReader("resultado2.txt");
			BufferedReader br = new BufferedReader(arquivo);

			String linha;
			int i = 0;
			double valor = 0;
			double max = 0;
			double min = 0;
			
			DecimalFormat df = new DecimalFormat("###.###");
            

			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
				System.out.println();
				i++;
				String[] vetor = new String[24];
				vetor = linha.split(",");
				for (int x = 0; x < 24; x++) {
					switch (x) {
					case 0:
						valor = Double.parseDouble(vetor[x]);
						min = -0.95197;
						max = 2.59171;
						valor = (valor - min)/(max-min);
						bw.write(df.format(valor)+ "|");
						break;
					case 1:
						valor = Double.parseDouble(vetor[x]);
						min = -0.48246;
						max = 0.48246;
						valor = (valor - min)/(max-min);
						bw.write(df.format(valor)+ "|");
						break;
					case 2:
						valor = Double.parseDouble(vetor[x]);
						min = -2.43591;
						max = 1.98437;
						valor = (valor - min)/(max-min);
						bw.write(df.format(valor)+ "|");
						break;
					case 3:
						valor = Double.parseDouble(vetor[x]);
						min = -0.57009;
						max = 0.96082;
						valor = (valor - min)/(max-min);
						bw.write(df.format(valor)+ "|");
						break;
					case 4:
						valor = Double.parseDouble(vetor[x]);
						min = -1.10702;
						max = 1.90725;
						valor = (valor - min)/(max-min);
						bw.write(df.format(valor)+ "|");
						break;
					default:
						bw.write(vetor[x] + "|");
						break;
						
					}
				}
				bw.write("\n");

			}
			br.close();
			bw.close();
		} catch (Exception e) {
			System.out.println("Erro "+e.getMessage());
		}

	}

	public static void main(String[] args) {
		Normalizador n = new Normalizador();

		 //n.gravar();
		//n.Leitura();
		n.normaliza();

	}

}
