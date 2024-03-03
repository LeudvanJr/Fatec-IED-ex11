package controller;

public class OperacoesController {
	public OperacoesController() {
		// TODO Auto-generated constructor stub
	}
	
	//Funcao para contar digitos de um inteiro
	public int contarDigitos(int num) {
		
		//Depois de muitas divisoes a parte inteira do numero chegara a 0
		if(num == 0)
			return 0;
		
		//soma-se 1 para contabilizar mais um digito e chama-se a funcao para uma versao menor do numero
		return 1 + contarDigitos(num/10);
	}
}
