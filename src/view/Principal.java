package view;

import controller.TabelaHash;
import model.Chocolate;

public class Principal {
	
	public static void main(String[] args) throws Exception {
		TabelaHash tblHash = new TabelaHash();
		Chocolate chocolate = new Chocolate();
		chocolate.volume = 60;
		tblHash.insertChocolate(chocolate);
		System.out.println("");
	}
}