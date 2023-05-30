package br.ucsal.bes.poo20221.ted.builder;

import br.ucsal.bes.poo20221.ted.domain.Ladino;

public class LadinoBuilder {
	//Builder com definição de valores padrão para os atributos da classe e métodos de criação do objeto.

    private static final String NOMECHAR_DEFAULT = "Nome";
	private static final String NOMEPLAYER_DEFAULT = "Nome";
	private static final int IDADE_DEFAULT = 18;
	private static final String RACA_DEFAULT = "Humano";
	private static final int PV_DEFAULT = 6;
	private static final int NIVEL_DEFAULT = 1;
	private static final int FORÇA_DEFAULT = 3;
	private static final int DESTREZA_DEFAULT = 12;
	private static final int CONSTITUICAO_DEFAULT = 4;
	private static final int INTELIGENCIA_DEFAULT = 6;
	private static final int SABEDORIA_DEFAULT = 5;
	private static final int CARISMA_DEFAULT = 6;
    private static final boolean ATAQUEFURTIVO_DEFAULT = true;
    private static final boolean ESQUIVASN_DEFAULT = true;
    private static final boolean FURTISUPERIOR_DEFAULT = false;

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
    private boolean ataqueFurtivo = ATAQUEFURTIVO_DEFAULT;
    private boolean esquivaSN = ESQUIVASN_DEFAULT;
    private boolean furtiSuperior = FURTISUPERIOR_DEFAULT;
    
    public static LadinoBuilder umLadino() {
		return new LadinoBuilder();
	}
	
	public LadinoBuilder setNomeChar(String nomeChar) {
		this.nomeChar = nomeChar;
		return this;
	}
	
	public LadinoBuilder setNomePlayer(String nomePlayer) {
		this.nomePlayer = nomePlayer;
		return this;
	}
			
	public LadinoBuilder setRaca(String raca) {
		this.raca = raca;
		return this;
	}
	
	public LadinoBuilder setPv(int pv) {
		this.pv = pv;
		return this;
	}
	
	public LadinoBuilder setNivel(int nivel) {
		this.nivel = nivel;
		return this;
	}

	public LadinoBuilder setIdade(int idade) {
		this.idade = idade;
		return this;
	}

	public LadinoBuilder setForca(int forca) {
		this.forca = forca;
		return this;
	}

	public LadinoBuilder setDestreza(int destreza) {
		this.destreza = destreza;
		return this;
	}

	public LadinoBuilder setConstituicao(int constituicao) {
		this.constituicao = constituicao;
		return this;
	}

	public LadinoBuilder setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
		return this;
	}

	public LadinoBuilder setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
		return this;
	}

	public LadinoBuilder setCarisma(int carisma) {
		this.carisma = carisma;
		return this;
	}
	
	public LadinoBuilder setAtaqueFurtivo (boolean ataqueFurtivo) {
        this.ataqueFurtivo = ataqueFurtivo;
        return this;
    }
    
    public LadinoBuilder setFurtiSuperior (boolean furtiSuperior) {
        this.furtiSuperior = furtiSuperior;
        return this;
    }
    
    public LadinoBuilder setEsquivaSN (boolean esquivaSN) {
        this.esquivaSN = esquivaSN;
        return this;
    }
    
    
    	public Ladino build() {
	    Ladino ladino = new Ladino();
	    ladino.setNomeChar(nomeChar);
	    ladino.setNomePlayer(nomePlayer);
	    ladino.setRaca(raca);
	    ladino.setIdade(idade);
	    ladino.setPv(pv);
	    ladino.setNivel(nivel);
	    ladino.setFrc(forca);
	    ladino.setDes(destreza);
	    ladino.setCon(constituicao);
	    ladino.setItl(inteligencia);
	    ladino.setSab(sabedoria);
	    ladino.setCar(carisma);
	    ladino.setAtaqueFurtivo(ataqueFurtivo);
	    ladino.setFurtiSuperior(furtiSuperior);
	    ladino.setEsquivaSN(esquivaSN);
	    return ladino;
		
}
}
