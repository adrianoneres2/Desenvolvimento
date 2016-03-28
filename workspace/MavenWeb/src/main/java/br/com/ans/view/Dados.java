package br.com.ans.view;

import java.util.ArrayList;;


public class Dados {

	
	public ArrayList<String> colunaEsquerda;
	public ArrayList<String> colunaDireita1;
	public ArrayList<String> colunaDireita2;

	
	public ArrayList<String> getColunaEsquerda() {
		return colunaEsquerda;
	}


	public void setColunaEsquerda(ArrayList<String> esq) {
		this.colunaEsquerda = esq;
	}


	public ArrayList<String> getColunaDireita1() {
		return colunaDireita1;
	}

	public void setColunaDireita1(ArrayList<String> colunaDireita1) {
		this.colunaDireita1 = colunaDireita1;
	}


	public ArrayList<String> getColunaDireita2() {
		return colunaDireita2;
	}


	public void setColunaDireita2(ArrayList<String> colunaDireita2) {
		this.colunaDireita2 = colunaDireita2;
	}


	public void enviar(){
		
		
		ArrayList<String> esq = new ArrayList<String>();
		ArrayList<String> dir = new ArrayList<String>();
		
		esq.add("esquerda");
		
		dir.add("Direita 1");
		dir.add("Direita 1");
		
		dir.add("Direita 2");
		dir.add("Direita 2");
		
		this.setColunaEsquerda(esq);
		this.setColunaDireita1(dir);
		
	}
	
	
}
