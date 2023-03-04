package View;

import java.util.Scanner;

import Controller.OperacoesController;

public class Main {

	public static void main(String[] args) {
		OperacoesController OC = new OperacoesController();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int n = sc.nextInt();
		while(n > 2000) {
			System.out.print("Digite um entre 0 e 20: ");
			 n = sc.nextInt();
		}
		String Bin = OC.ConverteBinario(n);
		
		sc.close();
		System.out.println(n + " em binário é: "+ Bin);
	}

}
