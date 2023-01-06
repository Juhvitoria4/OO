package Projeto1;

public class Departamento {
	/*atributos*/
	private int codigo;
	private String nome;
	private int quantidadeFuncionarios;
	/*Construtores*/
	public Departamento(int c, String n, int q) {
		this.codigo = c;
		this.nome = n;
		this.quantidadeFuncionarios = q;
	}
	public Departamento() {
		this.quantidadeFuncionarios = 0;
	}
	/*Getters and setters*/
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}
	public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}
	

}
