package br.edu.unifil.lpoo.equipe.modelo;

public class Jogador {
	private String nome;
	private String posicao;
	
	public Jogador(String nome, String posicao) {
		this.setNome(nome);
		this.setPosicao(posicao);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return this.posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
}
