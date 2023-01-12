package tic_tac_toe;

public class Campo {
	private char simbolo;
	
	
	public Campo() {
		this.simbolo = ' ';
	}


	public char getSimbolo() {
		return simbolo;
	}


	public void setSimbolo(char simbolo) {
		if (this.simbolo == ' ') {
			this.simbolo = simbolo;
		}else {
			System.out.println("O campo já está preenchido!");
		}
	}
	
	public void limpaCampo() {
		this.simbolo = ' ';
	}
}
