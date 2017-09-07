package codigos;


public class Padrao implements Comparable<Padrao>  {
	
	private double idade;
	private int sexoG1;
	private int sexoG2;
	private double grauInstrucao;
	private int etnia0;
	private int etnia1;
	private int etnia2;
	private int etnia3;
	private int etnia4;
	private int etnia5;
	private int etnia6;
	private String classificacao;
        private double distancia;



	public Padrao(double idade, int sexoG1, int sexoG2, double grauInstrucao, int etnia0, int etnia1, int etnia2,
			int etnia3, int etnia4, int etnia5, int etnia6, String classificacao, double distancia) {
		
		this.idade = idade;
		this.sexoG1 = sexoG1;
		this.sexoG2 = sexoG2;
		this.grauInstrucao = grauInstrucao;
		this.etnia0 = etnia0;
		this.etnia1 = etnia1;
		this.etnia2 = etnia2;
		this.etnia3 = etnia3;
		this.etnia4 = etnia4;
		this.etnia5 = etnia5;
		this.etnia6 = etnia6;
		this.classificacao = classificacao;
                this.distancia = distancia;
	}

	

	public Padrao() {
	}

	public int getEtnia0() {
		return etnia0;
	}

	public void setEtnia0(int etnia0) {
		this.etnia0 = etnia0;
	}

	public int getEtnia1() {
		return etnia1;
	}

	public void setEtnia1(int etnia1) {
		this.etnia1 = etnia1;
	}

	public int getEtnia2() {
		return etnia2;
	}

	public void setEtnia2(int etnia2) {
		this.etnia2 = etnia2;
	}

	public int getEtnia3() {
		return etnia3;
	}

	public void setEtnia3(int etnia3) {
		this.etnia3 = etnia3;
	}

	public int getEtnia4() {
		return etnia4;
	}

	public void setEtnia4(int etnia4) {
		this.etnia4 = etnia4;
	}

	public int getEtnia5() {
		return etnia5;
	}

	public void setEtnia5(int etnia5) {
		this.etnia5 = etnia5;
	}

	public int getEtnia6() {
		return etnia6;
	}

	public void setEtnia6(int etnia6) {
		this.etnia6 = etnia6;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}

	public int getSexoG1() {
		return sexoG1;
	}

	public void setSexoG1(int sexoG1) {
		this.sexoG1 = sexoG1;
	}

	public int getSexoG2() {
		return sexoG2;
	}

	public void setSexoG2(int sexoG2) {
		this.sexoG2 = sexoG2;
	}

	public double getGrauInstrucao() {
		return grauInstrucao;
	}

	public void setGrauInstrucao(double grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
        
        public double getDistancia() {
                return distancia;
    }

        public void setDistancia(double distancia) {
            this.distancia = distancia;
    }
    
    @Override
    public int compareTo(Padrao ca) {
        if (this.distancia < ca.distancia) {
            return -1;
        }
        if (this.distancia > ca.distancia) {
            return 1;
        }
        return 0;
    }

}
