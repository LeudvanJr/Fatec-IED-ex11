package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController opController = new OperacoesController();
		int numero = -12345;
		
		System.out.println(opController.contarDigitos(numero));	
	}

}
