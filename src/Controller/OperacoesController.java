package Controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	public String ConverteBinario(int n) {
	    if (n <= 1) { // CASO O VALOR DE N SEJA IGUAL OU MENOR QUE 1 DEVE RETORNAR O VALOR DE N
	        return String.valueOf(n);
	    }else {
		    int resto = n % 2; // CASO CONTRARIO DEVE DIVIDIR O VALOR POR DOIS
		    return ConverteBinario(n / 2) + String.valueOf(resto); // E FAZER A CHAMADA DA FUNÇÃO DIVIDINDO N/2 E CONCATENANDO NA STRING O RESTO DA DIVISÃO;
	    }
	}
}
