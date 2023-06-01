package br.ucsal.bes.poo20221.ted.builder;

import br.ucsal.bes.poo20221.ted.domain.Barbaro;
import br.ucsal.bes.poo20221.ted.domain.Personagem;

public interface PersonagemBuilder {
	
	//Builder com definição de valores padrão para os atributos da classe e métodos de criação do objeto.
	static final String NOMECHAR_DEFAULT = "Nome";
	static final String NOMEPLAYER_DEFAULT = "Nome";
	static final String RACA_DEFAULT = "Humano";
	static final int IDADE_DEFAULT = 18;
	static final int PV_DEFAULT = 12;
	static final int NIVEL_DEFAULT = 1;
	static final int FORÇA_DEFAULT = 10;
	static final int DESTREZA_DEFAULT = 5;
	static final int CONSTITUICAO_DEFAULT = 12;
	static final int INTELIGENCIA_DEFAULT = 2;
	static final int SABEDORIA_DEFAULT = 4;
	static final int CARISMA_DEFAULT = 0;


	String nomeChar = NOMECHAR_DEFAULT;
	String nomePlayer = NOMEPLAYER_DEFAULT;
	String raca = RACA_DEFAULT;
	int idade = IDADE_DEFAULT;
	int pv = PV_DEFAULT;
	int nivel = NIVEL_DEFAULT;
	int forca = FORÇA_DEFAULT;
	int destreza = DESTREZA_DEFAULT;
	int constituicao = CONSTITUICAO_DEFAULT;
	int inteligencia = INTELIGENCIA_DEFAULT;
	int sabedoria = SABEDORIA_DEFAULT;
	int carisma = CARISMA_DEFAULT;
	
	//Métodos que serão utilizados pelos builders específicos, que implementarão essa interface.
	
	public PersonagemBuilder setNomeChar(String nomeChar);

	public PersonagemBuilder setNomePlayer(String nomePlayer);

	public PersonagemBuilder setRaca(String raca);

	public PersonagemBuilder setPv(int pv);

	public PersonagemBuilder setNivel(int nivel);
	
	public PersonagemBuilder setIdade(int idade);

	public PersonagemBuilder setForca(int forca);

	public PersonagemBuilder setDestreza(int destreza);

	public PersonagemBuilder setConstituicao(int constituicao);

	public PersonagemBuilder setInteligencia(int inteligencia);

	public PersonagemBuilder setSabedoria(int sabedoria);

	public PersonagemBuilder setCarisma(int carisma); 
	
	public Personagem build();
}
