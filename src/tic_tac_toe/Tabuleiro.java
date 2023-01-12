package tic_tac_toe;

import java.util.Scanner;

public class Tabuleiro {
	Campo[][] campo = new Campo[3][3];
	Boolean jogoAtivo;
	char simboloDaVez;
	char vitoria;
	Scanner scan = new Scanner(System.in);
	
	public Tabuleiro() {
		this.jogoAtivo = true;
		this.vitoria = ' ';
		this.simboloDaVez = 'X';
		iniciarJogo(campo);
	}
	
	
	public void preencheTabuleiro() {
		int contador = 0;
		while(jogoAtivo) {
			desenhaJogo(campo);
			vitoria = verificaVitoria(campo);
			if(vitoria != ' ') {
				System.out.printf("\n%s venceu!\n", this.vitoria);
				break;
			}
			try {
				if(validaJogada(campo, jogar(scan,simboloDaVez), simboloDaVez)) {
					simboloDaVez = (simboloDaVez == 'X'? 'O' : 'X'); 
				}
				
			} catch(Exception e) {
				System.out.printf("Erro durante o progresso da jogada.");
			}
			contador++;
			if(contador == 9) {
				System.out.printf("Empate: Todos os campos foram preenchidos.\n");
				break;
			}
		}
		System.out.printf("Fim do jogo.\n");
	}


	public static void desenhaJogo(Campo[][] campo) {
		limparTela();
		System.out.println("    0   1    2");
		System.out.printf("0   %c | %c | %c  %n", campo[0][0].getSimbolo(),
				                                  campo[0][1].getSimbolo(),
				                                  campo[0][2].getSimbolo());
		System.out.println("   ------------ ");
		System.out.printf("1   %c | %c | %c  %n", campo[1][0].getSimbolo(),
                                                  campo[1][1].getSimbolo(),
                                                  campo[1][2].getSimbolo());
		System.out.println("   ------------ ");
		System.out.printf("2   %c | %c | %c  %n", campo[2][0].getSimbolo(),
                								  campo[2][1].getSimbolo(),
                								  campo[2][2].getSimbolo());
	}
	
	public static void limparTela() {
		for(int cont = 0; cont<200; cont++) {
			System.out.println("");
		}
	}
	
	public static int[] jogar(Scanner scan, char jogada) {
		int p[] = new int[2];
		System.out.printf("%s %c%n","É a vez de: ",jogada);
		System.out.print("Qual linha deseja jogar?: ");
		p[0] = scan.nextInt();
		System.out.print("Qual coluna deseja jogar?: ");
		p[1] = scan.nextInt();
		return p;
	}
	
	public static Boolean validaJogada(Campo[][] campo, int p[], char simboloDaVez) {
		if(campo[p[0]][p[1]].getSimbolo() == ' ') {
			campo[p[0]][p[1]].setSimbolo(simboloDaVez);
			return true;
		} else {
			System.out.println("O campo já está preenchido! Por favor, informe um campo vazio.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return false;
		}
	}
	
	public static void iniciarJogo(Campo[][] campo) {
		for(int linha=0; linha<3; linha++)
			for (int coluna=0; coluna<3;coluna++)
				campo[linha][coluna] = new Campo();
	}

	public char verificaVitoria(Campo[][] campo) {
		char vencedor = (simboloDaVez == 'X' ? 'O' : 'X');
		if(verificaLinhas(campo)) return vencedor;
		if(verificaColunas(campo)) return vencedor;
		if(verificaDiagonais(campo)) return vencedor;
		return ' ';
	}
	
	
	private static Boolean verificaLinhas(Campo[][] campo) {
		for(int i=0; i<3; i++) {
			char val0 = campo[i][0].getSimbolo();
			char val1 = campo[i][1].getSimbolo();
			char val2 = campo[i][2].getSimbolo();
			if (val0 != ' ') {
				if((val0 == val1) && (val0 == val2) && (val1 == val2)) {
					return true;	
				}
			}
		}
		return false;
	}
	
	private static Boolean verificaColunas(Campo[][] campo) {
		for(int i=0; i<3; i++) {
			char val0 = campo[0][i].getSimbolo();
			char val1 = campo[1][i].getSimbolo();
			char val2 = campo[2][i].getSimbolo();
			if (val0 != ' ') {
				if((val0 == val1) && (val0 == val2) && (val1 == val2)) {
					return true;	
				}
			}
		}
		return false;
	}
	
	private static Boolean verificaDiagonais(Campo[][] campo) {
		if(campo[1][1].getSimbolo() != ' ') {
			if ((campo[1][1].getSimbolo() == campo[0][0].getSimbolo())) {
				if(campo[0][0].getSimbolo() == campo[2][2].getSimbolo()) {
					return true;
				}
			}
			
			if(campo[1][1].getSimbolo() == campo[0][2].getSimbolo()) {
				if(campo[0][2].getSimbolo() == campo[2][0].getSimbolo()) {
					return true;
				}
			}
		}
		return false;
	}
		
}
		    
	

