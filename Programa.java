package aplicacao;
import java.util.Scanner;
//import javax.swing.JOptionPane;//

public class Programa {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Produto produto = new Produto();
		System.out.println("Informe o produto que sera cadastrado : ");
		produto.produto=teclado.next();
		
		System.out.println("Informe a quantidade : ");
		produto.quantidade=teclado.nextDouble();
		
		System.out.println("Informe o preço individual : ");
		produto.preco=teclado.nextDouble();
		
		System.out.println("confirmação: "+produto.produto+"\nEstoque atual : \n"+produto.quantidade+"\npreço : \n"+produto.preco);
		System.out.println("\nDeseja inserir mais produtos ? quantos : \n");
		int estoque=teclado.nextInt();
		produto.AddProduto(estoque);
		System.out.println("\nAtualização: "+produto.produto+"\nEstoque atual : \n"+produto.quantidade+"\npreço : \n"+produto.preco);
		
		System.out.println("\nAtualmente, alguma venda foi realizada ? \n");
		estoque=teclado.nextInt();
		produto.SubProduto(estoque);
		System.out.println("\nAtualização pós vendas: \n"+produto.produto+"\nEstoque atual : \n"+produto.quantidade+"\npreço : \n"+produto.preco+"\nValor do estoque : \n"+produto.preco*produto.quantidade);
	//JOptionPane.showConfirmDialog(null,"\nAtualização pós vendas: \n"+produto.produto+"\nEstoque atual : \n"+produto.quantidade+"\npreço : \n"+produto.preco+"\nValor do estoque : \n"+produto.preco*produto.quantidade);//
	teclado.close();
	}
}
