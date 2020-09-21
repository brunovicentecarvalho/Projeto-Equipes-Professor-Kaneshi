package br.edu.unifil.lpoo.equipe.controle;
import java.util.ArrayList;
import br.edu.unifil.lpoo.equipe.modelo.*;
public class Controle {
	private ArrayList<Equipe> listaEquipe;
	private ArrayList<Jogador> listaJogadores;
	
	public Controle() {
		listaEquipe = new ArrayList<>();
		listaJogadores = new ArrayList<>();
	}
	public void cadastraJogador(String nome, String posicao) {
		Jogador jog = new Jogador(nome,posicao);
		if(listaJogadores.add(jog)) {
			System.out.println("Jogador " + nome + " adicionado com sucesso");
		}
	}
	public void cadastraEquipe(String nome) {
		Equipe equipe = new Equipe(nome);
		if(listaEquipe.add(equipe)) {
			System.out.println("Equipe " + nome + " adicionada com sucesso");
		}
	}
	public void contrataJogador(String nomeEquipe, String nomeJogador) {
		Equipe auxEquipe;
		Jogador auxJogador;
		for (int i = 0; i < listaEquipe.size(); i++) {
			auxEquipe = listaEquipe.get(i);
			if(auxEquipe.getNomeEquipe().equals(nomeEquipe)) {
				auxJogador = retornaJogadores(nomeJogador);
				if(auxEquipe.adicionaJogador(auxJogador)) {
					System.out.println("Jogador "+ auxJogador.getNome()+ " contratado com sucesso");
				}
			}
		}
	}
	public Jogador retornaJogadores(String nomeJogador) {
		
		Jogador auxJogador;
		for (int i = 0; i < listaJogadores.size(); i++) {
			auxJogador = listaJogadores.get(i);
			if(auxJogador.getNome().equals(nomeJogador)) {
				return auxJogador;
			}
			continue;
		}
		throw new Error("Jogador não encontrado");
	}
	public void demiteJogador(String nomeEquipe, String nomeJogador) {
		Equipe auxEquip;
		Jogador auxJogador;
		for (int i = 0; i < listaEquipe.size(); i++) {
			auxEquip = listaEquipe.get(i);
			if(auxEquip.getNomeEquipe().equals(nomeEquipe)) {
				auxJogador = retornaJogadores(nomeJogador);
				if(auxEquip.removeJogador(auxJogador)) {
					System.out.println("Jogador "+ auxJogador.getNome()+ " removido com sucesso");
				}
				
			}
		}
	}
	
	public String mostraJogadores (String nome) {
		String saida = "";
		Equipe auxEquip;
		for (int i = 0; i < listaEquipe.size(); i++) {
			auxEquip = listaEquipe.get(i);
			if(auxEquip.getNomeEquipe().equals(nome)) {
				saida = auxEquip.listaJogadores();
			}
		}
		return saida;
	}
	
	public String mesmaPosicao(String posicao) {
		Jogador auxJog;
		String saida = "";
		for (int i = 0; i < listaJogadores.size(); i++) {
			auxJog = listaJogadores.get(i);
			if(auxJog.getPosicao().equals(posicao)) {
				saida += "Jogador : " + auxJog.getNome() + " \n"
						+ "Posicao : " + auxJog.getPosicao() + "\n";
			}
		}
		return saida;
	}
	
	
}
