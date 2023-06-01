package br.ucsal.bes.poo20221.ted.builder;

import br.ucsal.bes.poo20221.ted.domain.Ranger;

public class RangerBuilder implements PersonagemBuilder {
	//Builder com definição de valores padrão para os atributos da classe e métodos de criação do objeto.
	

    private static final String NOMECHAR_DEFAULT = "Nome";
	private static final String NOMEPLAYER_DEFAULT = "Nome";
	private static final int IDADE_DEFAULT = 18;
	private static final String RACA_DEFAULT = "Humano";
	private static final int PV_DEFAULT = 10;
	private static final int NIVEL_DEFAULT = 1;
	private static final int FORÇA_DEFAULT = 10;
	private static final int DESTREZA_DEFAULT = 16;
	private static final int CONSTITUICAO_DEFAULT = 10;
	private static final int INTELIGENCIA_DEFAULT = 12;
	private static final int SABEDORIA_DEFAULT = 12;
	private static final int CARISMA_DEFAULT = 12;
    private static final boolean RASTREADOREFICAZ_DEFAULT = false;
    private static final boolean RASTROINVISIVEL_DEFAULT = true;
    private static final boolean CAMUFLAGEM_DEFAULT = true;

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
    private boolean rastreadorEficaz = RASTREADOREFICAZ_DEFAULT; 
    private boolean rastroInvisivel = RASTROINVISIVEL_DEFAULT;
    private boolean camuflagem = CAMUFLAGEM_DEFAULT;
    
    public static RangerBuilder umRanger() {
		return new RangerBuilder();
	}
	
    @Override
	public RangerBuilder setNomeChar(String nomeChar) {
		this.nomeChar = nomeChar;
		return this;
	}
    
    @Override
	public RangerBuilder setNomePlayer(String nomePlayer) {
		this.nomePlayer = nomePlayer;
		return this;
	}
			
    @Override
	public RangerBuilder setRaca(String raca) {
		this.raca = raca;
		return this;
	}
	
    @Override
	public RangerBuilder setPv(int pv) {
		this.pv = pv;
		return this;
	}
	
    @Override
	public RangerBuilder setNivel(int nivel) {
		this.nivel = nivel;
		return this;
	}

    @Override
	public RangerBuilder setIdade(int idade) {
		this.idade = idade;
		return this;
	}

    @Override
	public RangerBuilder setForca(int forca) {
		this.forca = forca;
		return this;
	}

    @Override
	public RangerBuilder setDestreza(int destreza) {
		this.destreza = destreza;
		return this;
	}

    @Override
	public RangerBuilder setConstituicao(int constituicao) {
		this.constituicao = constituicao;
		return this;
	}

    @Override
	public RangerBuilder setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
		return this;
	}

    @Override
	public RangerBuilder setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
		return this;
	}

    @Override
	public RangerBuilder setCarisma(int carisma) {
		this.carisma = carisma;
		return this;
	}

    
	public RangerBuilder setRastreadorEficaz(boolean rastreadorEficaz) {
		this.rastreadorEficaz = rastreadorEficaz;
		return this;
	}

	public RangerBuilder setRastroInvisivel(boolean rastroInvisivel) {
		this.rastroInvisivel = rastroInvisivel;
		return this;
	}

	public RangerBuilder setCamuflagem(boolean camuflagem) {
		this.camuflagem = camuflagem;
		return this;
	}
	
	@Override
	public Ranger build() {
	    Ranger ranger = new Ranger();
	    ranger.setNomeChar(nomeChar);
	    ranger.setNomePlayer(nomePlayer);
	    ranger.setRaca(raca);
	    ranger.setIdade(idade);
	    ranger.setPv(pv);
	    ranger.setNivel(nivel);
	    ranger.setFrc(forca);
	    ranger.setDes(destreza);
	    ranger.setCon(constituicao);
	    ranger.setItl(inteligencia);
	    ranger.setSab(sabedoria);
	    ranger.setCar(carisma);
	    ranger.setRastreadorEficaz(rastreadorEficaz);
	    ranger.setRastroInvisivel(rastroInvisivel);
	    ranger.setCamuflagem(camuflagem);
	    return ranger;
	}
}
