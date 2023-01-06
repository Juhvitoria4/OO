package Pedido;

public class PessoaFisica extends Cliente {
	
	
	private String cpf;
	private String nome;
	
	
	//Construtores
	
	public PessoaFisica(String cpf, String nome, String endereco, String cidade, String cep, int idade) {
		super(endereco, cidade, cep, idade);
		this.cpf=cpf;
		this.nome=nome;


	}
	
	
	/* servicos */
	public boolean maiorDeIdade() {
		
		if(this.getIdade() < 18) return false;
		
		return true;
		
	}
	
	public float calculaDesconto(float preco) {
		
		if(preco <= 100) return (float) 0.05;
		else return (float) 0.1;
		
	}
	
	
	
	
	//getters and setters
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
