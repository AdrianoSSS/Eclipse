package aplicacao_pacote;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Produto produto = new Produto();
		System.out.println("Informe o produto que sera cadastrado : ");
		produto.produto=teclado.next();
		
		System.out.println("Informe a quantidade : ");
		produto.quantidade=teclado.nextDouble();
		
		System.out.println("Informe o pre�o individual : ");
		produto.preco=teclado.nextDouble();
		
		System.out.println("confirma��o: "+produto.produto+"\nEstoque atual : \n"+produto.quantidade+"\npre�o : \n"+produto.preco);
		System.out.println("\nDeseja inserir mais produtos ? quantos : \n");
		int estoque=teclado.nextInt();
		produto.AddProduto(estoque);
		System.out.println("\nAtualiza��o: "+produto.produto+"\nEstoque atual : \n"+produto.quantidade+"\npre�o : \n"+produto.preco);
		
		System.out.println("\nAtualmente, alguma venda foi realizada ? \n");
		estoque=teclado.nextInt();
		produto.SubProduto(estoque);
		System.out.println("\nAtualiza��o p�s vendas: "+produto.produto+"\nEstoque atual : \n"+produto.quantidade+"\npre�o : \n"+produto.preco);
		
	teclado.close();
	}
}

