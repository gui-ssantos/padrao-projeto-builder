package br.ucsal.bes.poo20221.ted.builder;

import br.ucsal.bes.poo20221.ted.domain.Barbaro;

public class BarbaroBuilder {
	//Builder com definição de valores padrão para os atributos da classe e métodos de criação do objeto.

	private static final String NOMECHAR_DEFAULT = "Nome";
	private static final String NOMEPLAYER_DEFAULT = "Nome";
	private static final String RACA_DEFAULT = "Humano";
	private static final int IDADE_DEFAULT = 18;
	private static final int PV_DEFAULT = 12;
	private static final int NIVEL_DEFAULT = 1;
	private static final int FORÇA_DEFAULT = 10;
	private static final int DESTREZA_DEFAULT = 5;
	private static final int CONSTITUICAO_DEFAULT = 12;
	private static final int INTELIGENCIA_DEFAULT = 2;
	private static final int SABEDORIA_DEFAULT = 4;
	private static final int CARISMA_DEFAULT = 0;
	private static final boolean ESQUIVAN_DEFAULT = false;
	private static final boolean FURIA_DEFAULT = true;
	private static final boolean REDUCAODANO_DEFAULT = true;

	private String nomeChar = NOMECHAR_DEFAULT;
	private String nomePlayer = NOMEPLAYER_DEFAULT;
	private String raca = RACA_DEFAULT;
	private int idade = IDADE_DEFAULT;
	private int pv = PV_DEFAULT;
	private int nivel = NIVEL_DEFAULT;
	private int forca = FORÇA_DEFAULT;
	private int destreza = DESTREZA_DEFAULT;
	private int constituicao = CONSTITUICAO_DEFAULT;
	private int inteligencia = INTELIGENCIA_DEFAULT;
	private int sabedoria = SABEDORIA_DEFAULT;
	private int carisma = CARISMA_DEFAULT;
	private boolean esquivaN = ESQUIVAN_DEFAULT;
	private boolean furia = FURIA_DEFAULT;
	private boolean reducaoDano = REDUCAODANO_DEFAULT;

	public static BarbaroBuilder umBarbaro() {
		return new BarbaroBuilder();
	}

	public BarbaroBuilder setNomeChar(String nomeChar) {
		this.nomeChar = nomeChar;
		return this;
	}

	public BarbaroBuilder setNomePlayer(String nomePlayer) {
		this.nomePlayer = nomePlayer;
		return this;
	}

	public BarbaroBuilder setRaca(String raca) {
		this.raca = raca;
		return this;
	}

	public BarbaroBuilder setPv(int pv) {
		this.pv = pv;
		return this;
	}

	public BarbaroBuilder setNivel(int nivel) {
		this.nivel = nivel;
		return this;
	}

	public BarbaroBuilder setIdade(int idade) {
		this.idade = idade;
		return this;
	}

	public BarbaroBuilder setForca(int forca) {
		this.forca = forca;
		return this;
	}

	public BarbaroBuilder setDestreza(int destreza) {
		this.destreza = destreza;
		return this;
	}

	public BarbaroBuilder setConstituicao(int constituicao) {
		this.constituicao = constituicao;
		return this;
	}

	public BarbaroBuilder setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
		return this;
	}

	public BarbaroBuilder setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
		return this;
	}

	public BarbaroBuilder setCarisma(int carisma) {
		this.carisma = carisma;
		return this;
	}

	public BarbaroBuilder setEsquivaN(boolean esquivaN) {
		this.esquivaN = esquivaN;
		return this;
	}

	public BarbaroBuilder setFuria(boolean furia) {
		this.furia = furia;
		return this;
	}

	public BarbaroBuilder setReducaoDano(boolean reducaoDano) {
		this.reducaoDano = reducaoDano;
		return this;
	}

	public Barbaro build() {
		Barbaro barbaro = new Barbaro();
		barbaro.setNomeChar(nomeChar);
		barbaro.setNomePlayer(nomePlayer);
		barbaro.setRaca(raca);
		barbaro.setIdade(idade);
		barbaro.setPv(pv);
		barbaro.setNivel(nivel);
		barbaro.setFrc(forca);
		barbaro.setDes(destreza);
		barbaro.setCon(constituicao);
		barbaro.setItl(inteligencia);
		barbaro.setSab(sabedoria);
		barbaro.setCar(carisma);
		barbaro.setEsquivaN(esquivaN);
		barbaro.setFuria(furia);
		barbaro.setReducaoDano(reducaoDano);
		return barbaro;
	}

}
