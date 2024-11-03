package controller;

import ControllerLista.Lista;
import model.Chocolate;

public class TabelaHash {
	
	Lista<Chocolate>[] tabelaChocolates;
	
	public TabelaHash() {
		tabelaChocolates = new Lista[5];
		inicializaTabela();
	}
	
	private void inicializaTabela() {
		for(int i = 0; i < 5; i++) {
			tabelaChocolates[i] = new Lista<Chocolate>();
		}
	}
	
	public void insertChocolate(Chocolate chocolate) throws Exception {
		int posicao = chocolate.hashCode();
		tabelaChocolates[posicao].addLast(chocolate);
	}
	
	
}
