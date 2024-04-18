package aplicacao;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Programa {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Produto produto = new Produto();
	System.out.println("Informe o produto que será cadastrado: ");
	produto.nome = input.nextLine();
	
	System.out.println("Informe a quantidade: ");
	produto.quantidade = input.nextDouble();
	
	System.out.println("Informe o preço unitário: ");
	produto.preco = input.nextFloat();
	
	System.out.println("Confirmação: " + produto.nome+", estoque atual: "+produto.quantidade+", preço: "+ produto.preco);
	
	System.out.println("Deseja adicionar mais produtos? Quantos: ");
	int estoque = input.nextInt();
	produto.AddProduto(estoque);
	
	System.out.println("Atualização: " + produto.nome+", estoque atual: "+produto.quantidade+", preço: "+ produto.preco);
	
	System.out.println("Atualmente, alguma venda foi realizada? Quantas?");
	estoque = input.nextInt(estoque);
	produto.SubProduto(estoque);
	System.out.println("Atualização pós vendas: " + produto.nome+", estoque atual: "+produto.quantidade+", preço: "+ produto.preco);
	JOptionPane.showConfirmDialog(null,"Atualização pós vendas: " + produto.nome+", estoque atual: "+produto.quantidade+", preço: "+ produto.preco);
	input.close();
    
	
	}
}
