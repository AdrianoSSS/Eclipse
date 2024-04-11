package aplicacao_pacote;

public class Produto {
	public String produto;
	public double quantidade;
	public double preco;	
	public void  AddProduto(int estoque) {
		this.quantidade+= estoque;
	}
	public void SubProduto(int estoque) {
		this.quantidade-= estoque;
	}
}
