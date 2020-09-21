package br.edu.unifil.lpoo.equipe.visao;
import java.util.Scanner;
import br.edu.unifil.lpoo.equipe.controle.*;
public class Principal {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Controle ctr = new Controle();
		String nomeEquipe, nomeJogador, posicao;
		int opcao = 0;
		while(opcao != 9) {
			System.out.println("1 – Cadastra jogador");
			System.out.println("2 – Cadastra equipe");
			System.out.println("3 – Contrata jogador");
			System.out.println("4 – Demite jogador");
			System.out.println("5 – Listar jogadores de um time");
			System.out.println("6 – Listar jogadores por posição");
			System.out.println("9 – Encerrar programa");
			opcao = leia.nextInt();
			System.out.println();
			switch (opcao) {
			case 1:
				System.out.print("Nome Jogador: ");
				nomeJogador = leia.next();
				System.out.print("Posicao : ");
				posicao = leia.next();
				ctr.cadastraJogador(nomeJogador, posicao);
				break;
			case 2:
				System.out.print("Nome Equipe :");
				nomeEquipe = leia.next();
				ctr.cadastraEquipe(nomeEquipe);
				break;
			case 3:
				System.out.println("Nome Equipe Contratante : ");
				nomeEquipe = leia.next();
				System.out.println("Nome Jogador Contratado : ");
				nomeJogador = leia.next();
				ctr.contrataJogador(nomeEquipe, nomeJogador);
				break;
			case 4: 
				System.out.print("Nome Equipe : ");
				nomeEquipe = leia.next();
				System.out.print("Nome Jogador Demitido : ");
				nomeJogador = leia.next();
				ctr.demiteJogador(nomeEquipe, nomeJogador);
				break;
			case 5:
				System.out.print("Nome Equipe : ");
				nomeEquipe = leia.next();
				System.out.println(ctr.mostraJogadores(nomeEquipe));
				break;
			case 6: 
				System.out.print("Posicao : ");
				posicao = leia.next();
				System.out.println(ctr.mesmaPosicao(posicao));
				break;
			default:
				System.out.println("Comando invalido");
				break;
			}
			System.out.println();
		}
		System.out.println("Fim Programa !");
	}
}
