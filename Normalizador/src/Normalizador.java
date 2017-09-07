import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;

public class Normalizador {

	public void Grava() {

		try {

			File file = new File("resultado3.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			FileReader arquivo = new FileReader("resultado2.txt");
			BufferedReader br = new BufferedReader(arquivo);

			String linha;

			while ((linha = br.readLine()) != null) {
				String[] vetor = new String[24];
				vetor = linha.split(",");

				for (int i = 0; i < 24; i++) {
					if (i != 3) {
						bw.write(vetor[i] + ",");
					}
				}
				bw.write("\n");
			}

			br.close();
			bw.close();
		} catch (Exception e) {

		}

	}

	public void normaliza() {
		try {

			File file = new File("resultadoFinal.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			FileReader arquivo = new FileReader("resultado3.txt");
			BufferedReader br = new BufferedReader(arquivo);

			String linha;

			double valor = 0;
			double max = 0;
			double min = 0;

			DecimalFormat df = new DecimalFormat("###.###");

			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
				System.out.println();
				String[] vetor = new String[23];
				vetor = linha.split(",");
				for (int x = 0; x < 23; x++) {
					switch (x) {
					case 0:
						valor = Double.parseDouble(vetor[x]);
						min = -0.95197;
						max = 2.59171;
						valor = (valor - min) / (max - min);
						bw.write(df.format(valor) + "|");
						break;
					case 1:
						valor = Double.parseDouble(vetor[x]);
						if (valor >= 0) {
							bw.write("1|0|");
						} else {
							bw.write("0|1|");
						}

						break;
					case 2:
						valor = Double.parseDouble(vetor[x]);
						min = -2.43591;
						max = 1.98437;
						valor = (valor - min) / (max - min);
						bw.write(df.format(valor) + "|");
						break;
					case 3:
						valor = Double.parseDouble(vetor[x]);
						if (valor == -0.50212) {
							bw.write("0|0|0|0|0|0|1|");
						} else {
							if (valor == -1.10702) {
								bw.write("0|0|0|0|0|1|0|");
							} else {
								if (valor == 1.90725) {
									bw.write("0|0|0|0|1|0|0|");
								} else {
									if (valor == 0.12600) {
										bw.write("0|0|0|1|0|0|0|");
									} else {
										if (valor == -0.22166) {
											bw.write("0|0|1|0|0|0|0|");
										} else {
											if (valor == 0.11440) {
												bw.write("0|1|0|0|0|0|0|");
											} else {
												bw.write("1|0|0|0|0|0|0|");
											}
										}
									}
								}
							}
						}
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
			System.out.println("Erro " + e.getMessage());
		}

	}

	public void Calc(double val) {

		DecimalFormat df = new DecimalFormat("###.###");
		double min = -1.10702;
		double max = 1.90725;
		val = (val - min) / (max - min);

		System.out.println(df.format(val) + " ");

	}

	public static void main(String[] args) {
		Normalizador n = new Normalizador();

		// n.gravar();
		// n.Leitura();
		n.normaliza();

	}

}
