package
 br.ucsal.bes.poo20221.ted.builder;

import br.ucsal.bes.poo20221.ted.domain.Mago;

public class MagoBuilder {
    private static final String NOMECHAR_DEFAULT = "Nome";
	private static final String NOMEPLAYER_DEFAULT = "Nome";
	private static final int IDADE_DEFAULT = 18;
	private static final String RACA_DEFAULT = "Humano";
	private static final int PV_DEFAULT = 8;
	private static final int NIVEL_DEFAULT = 1;
	private static final int FORÇA_DEFAULT = 10;
	private static final int DESTREZA_DEFAULT = 5;
	private static final int CONSTITUICAO_DEFAULT = 8;
	private static final int INTELIGENCIA_DEFAULT = 16;
	private static final int SABEDORIA_DEFAULT = 16;
	private static final int CARISMA_DEFAULT = 14;
    private static final boolean FIREBALL_DEFAULT = true;
    private static final boolean PERSUASAO_DEFAULT = true;
    private static final boolean CURAFEITICO_DEFAULT = true;

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
    private boolean fireball = FIREBALL_DEFAULT;
    private boolean persuasao = PERSUASAO_DEFAULT;
    private boolean curaFeitico = CURAFEITICO_DEFAULT;
    
	public static MagoBuilder umMago() {
		return new MagoBuilder();
	}
	
	public MagoBuilder setNomeChar(String nomeChar) {
		this.nomeChar = nomeChar;
		return this;
	}
	
	public MagoBuilder setNomePlayer(String nomePlayer) {
		this.nomePlayer = nomePlayer;
		return this;
	}
			
	public MagoBuilder setRaca(String raca) {
		this.raca = raca;
		return this;
	}
	
	public MagoBuilder setPv(int pv) {
		this.pv = pv;
		return this;
	}
	
	public MagoBuilder setNivel(int nivel) {
		this.nivel = nivel;
		return this;
	}

	public MagoBuilder setIdade(int idade) {
		this.idade = idade;
		return this;
	}

	public MagoBuilder setForca(int forca) {
		this.forca = forca;
		return this;
	}

	public MagoBuilder setDestreza(int destreza) {
		this.destreza = destreza;
		return this;
	}

	public MagoBuilder setConstituicao(int constituicao) {
		this.constituicao = constituicao;
		return this;
	}

	public MagoBuilder setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
		return this;
	}

	public MagoBuilder setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
		return this;
	}

	public MagoBuilder setCarisma(int carisma) {
		this.carisma = carisma;
		return this;
	}

	public MagoBuilder setFireball(boolean fireball) {
		this.fireball = fireball;
		return this;
	}

	public MagoBuilder setPersuasao(boolean persuasao) {
		this.persuasao = persuasao;
		return this;
	}

	public MagoBuilder setCuraFeitico(boolean curaFeitico) {
		this.curaFeitico = curaFeitico;
		return this;
	}
	
	public Mago build() {
	    Mago mago = new Mago();
	    mago.setNomeChar(nomeChar);
	    mago.setNomePlayer(nomePlayer);
	    mago.setRaca(raca);
	    mago.setIdade(idade);
	    mago.setPv(pv);
	    mago.setNivel(nivel);
	    mago.setFrc(forca);
	    mago.setDes(destreza);
	    mago.setCon(constituicao);
	    mago.setItl(inteligencia);
	    mago.setSab(sabedoria);
	    mago.setCar(carisma);
	    mago.setFireball(fireball);
	    mago.setPersuasao(persuasao);
	    mago.setCuraFeitico(curaFeitico);
	    return mago;
	}
}
