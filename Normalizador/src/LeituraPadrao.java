import java.io.BufferedReader;
import java.io.FileReader;

public class LeituraPadrao {

	public void lerArquivo() {
		try {
			FileReader arquivo = new FileReader("resultadoFinal.txt");
			BufferedReader br = new BufferedReader(arquivo);
			String linha;

			while ((linha = br.readLine()) != null) {
				Padrao pl = new Padrao();

				String[] vetor = new String[25];
				vetor = linha.split("|");
				
				
				System.out.println(linha);
				System.out.println();
				
				for(int i = 0 ; i < 25 ; i++) {
					System.out.print(vetor[i]+" ");
					
				}
				System.out.println();

			}
			br.close();

		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}

	}
	
	public static void main(String[] Args) {
		LeituraPadrao lp = new LeituraPadrao();
		lp.lerArquivo();
	}
}
