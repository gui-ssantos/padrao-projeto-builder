package br.ucsal.bes.poo20221.ted.TUI;

import java.util.Scanner;
import br.ucsal.bes.poo20221.ted.domain.Ladino;
import br.ucsal.bes.poo20221.ted.exceptions.ValorIncorretoException;
import br.ucsal.bes.poo20221.ted.builder.LadinoBuilder;
import br.ucsal.bes.poo20221.ted.business.PersonagemBO;

public class LadinoTUI {

	public static void criacaoPrincipal() {
		Scanner ent = new Scanner(System.in);
		
		print("Informe seu Nome");
		String nomePlayer = ent.nextLine();
		
		print("Informe o nome do seu personagem:");
		String nomeChar = ent.nextLine();
		
		print("Informe sua idade:");
		int idade = ent.nextInt();
		String raca = "";
		try {
			raca = escolherRaca();
		} catch (ValorIncorretoException e) {
			print("Valor informado de forma incorreta, escolha uma op��o entre 1 e 4");
		}
		
		print("Informe os pontos de vida do seu personagem:");
		int pv = ent.nextInt();
		
		print("Informe o n�vel do seu personagem:");
		int nivel = ent.nextInt();
		
		//leitor de atributos
		print("Insira o n�mero da for�a do seu personagem: ");
		int frc = ent.nextInt();
		
		print("Insira o n�mero da destreza do seu personagem: ");
		int des = ent.nextInt();
		
		print("Insira o n�mero da constitui��o do seu personagem: ");
		int con = ent.nextInt();
		
		print("Insira o n�mero da intelig�ncia do seu personagem: ");
		int itl = ent.nextInt();
		
		print("Insira o n�mero da sabedoria do seu personagem: ");
		int sab = ent.nextInt();
		
		print("Insira o n�mero da carisma do seu personagem: ");
		int car = ent.nextInt();
		
		boolean ataqueFurtivo = temAtaqueFurtivo();
		boolean esquivaSN = temEsquivaSN();
		boolean furtiSuperior = temFurtiSuperior();
		
//		BUILDER:
//		Forma que a criação era realizada antes, sem builder:
//		Ladino ladino = new Ladino(nomeChar, nomePlayer, idade, raca, pv, nivel,frc, des, con, itl, sab, car, ataqueFurtivo, esquivaSN, furtiSuperior);
//		Criação com builder:
		
		Ladino ladino = LadinoBuilder.umLadino().setNomeChar(nomeChar).
				setNomePlayer(nomePlayer).
				setIdade(idade).
				setRaca(raca).
				setPv(pv).
				setNivel(nivel).
				setForca(frc).
				setDestreza(des).
				setConstituicao(con).
				setInteligencia(itl).
				setSabedoria(sab).
				setCarisma(car).
				setAtaqueFurtivo(ataqueFurtivo).
				setEsquivaSN(esquivaSN).
				setFurtiSuperior(furtiSuperior).
			build();
		
		PersonagemBO.cadastrarLadino(ladino);
		
	}

	private static boolean temAtaqueFurtivo() {
		Scanner ent = new Scanner(System.in);
		boolean en = false;
		print("Seu personagem tem a habilidade Ataque furtivo?" + "\n1) Sim" + "\n2) N�o");
		int escolha = ent.nextInt();
		try {
			switch (escolha) {
			case 1:
				return true;
			case 2:
				return false;
			default:
				throw new ValorIncorretoException("Valor incorretamente informado, insira um n�mero entre 1 e 2.");
			}
		} catch (ValorIncorretoException e) {
			print("Valor incorretamente informado, insira um n�mero entre 1 e 2.");
			temAtaqueFurtivo();
		}
		return en;
	}

	private static boolean temEsquivaSN() {
		Scanner ent = new Scanner(System.in);
		boolean en = false;
		print("Seu personagem tem a habilidade Esquiva Sobrenatural?" + "\n1) Sim" + "\n2) N�o");
		int escolha = ent.nextInt();
		try {
			switch (escolha) {
			case 1:
				return true;
			case 2:
				return false;
			default:
				throw new ValorIncorretoException("Valor incorretamente informado, insira um n�mero entre 1 e 2.");
			}
		} catch (ValorIncorretoException e) {
			print("Valor incorretamente informado, insira um n�mero entre 1 e 2.");
			temEsquivaSN();
		}
		return en;
	}

	private static boolean temFurtiSuperior() {
		Scanner ent = new Scanner(System.in);
		boolean en = false;
		print("Seu personagem tem a habilidade Furtividade Superior?" + "\n1) Sim" + "\n2) N�o");
		int escolha = ent.nextInt();
		try {
			switch (escolha) {
			case 1:
				return true;
			case 2:
				return false;
			default:
				throw new ValorIncorretoException("Valor incorretamente informado, insira um n�mero entre 1 e 2.");
			}
		} catch (ValorIncorretoException e) {
			print("Valor incorretamente informado, insira um n�mero entre 1 e 2.");
			temFurtiSuperior();
		}
		return en;
	}

	private static String escolherRaca() throws ValorIncorretoException {
		String raca;
		Scanner ent = new Scanner(System.in);
		print("Escolha a Ra�a digitando o respectivo n�mero:" + "\n1) Humano" + "\n2) Elfo" + "\n3) Orc"
				+ "\n4) An�o");
		int escolha = ent.nextInt();
		switch (escolha) {
		case 1:
			raca = "Humano";
			break;
		case 2:
			raca = "Elfo";
			break;
		case 3:
			raca = "Orc";
			break;
		case 4:
			raca = "An�o";
			break;
		default:
			throw new ValorIncorretoException("Valor incorretamente informado, insira um n�mero entre 1 e 4.");
		}
		return raca;
	}

	public static void print(String txt) {
		System.out.println(txt);
	}

}
