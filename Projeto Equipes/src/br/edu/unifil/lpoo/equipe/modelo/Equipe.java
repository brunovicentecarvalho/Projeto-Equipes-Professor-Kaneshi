package br.edu.unifil.lpoo.equipe.modelo;
import java.util.ArrayList;

public class Equipe {
	private String nomeEquipe;
	private ArrayList<Jogador> listaJogadores;
	
	public Equipe(String nome) {
		this.setNomeEquipe(nome);
		listaJogadores = new ArrayList<>();
	}
	
	public boolean adicionaJogador(Jogador jogador) {
		if(this.listaJogadores.add(jogador)) {
			return true;
		}
		return false;
	}
	
	public boolean removeJogador(Jogador jogador) {
		if(this.listaJogadores.remove(jogador)) {
			return true;
		}
		return false;
			
	}
	
	public String listaJogadores() {
		System.out.println("Equipe com " + listaJogadores.size() + " jogadores.");
		String saida = "";
		Jogador jogAux;
		for (int i = 0; i < listaJogadores.size(); i++) {
			jogAux = listaJogadores.get(i);
			saida += jogAux.getNome() + " " + jogAux.getPosicao() + " \n";
		}
		return saida;
	}
	public Jogador getJogador(String nome) {
		Jogador jogAux;
		for (int i = 0; i < listaJogadores.size(); i++) {
			jogAux = listaJogadores.get(i);
			if(jogAux.getNome().equals(nome)) {
				return jogAux;
			}
		}
		return null;
	}

	public String getNomeEquipe() {
		return this.nomeEquipe;
	}

	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}

	public ArrayList<Jogador> getListaJogadores() {
		return this.listaJogadores;
	}

	public void setListaJogadores(ArrayList<Jogador> listaJogadores) {
		this.listaJogadores = listaJogadores;
	}
}
