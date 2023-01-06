package Pedido;

abstract class Cliente {
	
	// atributos
	private String endereco;
	private String cidade;
	private String cep;
	private int idade;
	
	
	/*construtores*/

	//serviços
	
	public float calculaDesconto(float preco) {
		
		if(preco <= 200) return (float) 0.05;
		else return (float) 0.1;
		
	}
	
	
	
	
	/* getter and setters*/
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
}
