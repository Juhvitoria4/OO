package Projeto1;

import java.util.ArrayList;

public class Empresa {
	
	/*atributos*/
	
	private int codigo;
	private String nome;
	private int qtdDepartamentos;
	private ArrayList<Departamento> departamentos;

	
	
	/*Construtores*/
	
	
	public Empresa(int c, String n) {
		
		this.codigo=c;
		this.nome=n;
		this.qtdDepartamentos=0;
		this.departamentos= new ArrayList<>();		
	}
	
	public Empresa() {};
	
	
	/*servicos*/
	
	public int calcularQtdFuncionarios() {
		
		int qtd=0;
		Departamento d;
		
		for (int i=0;i<this.departamentos.size();i++) {
			d = this.departamentos.get(i);
			qtd+=d.getQuantidadeFuncionarios();
		}
		
		return qtd;
		
	}
	
	public void addDepartamento(Departamento d) {
		
		this.departamentos.add(d);
		this.qtdDepartamentos++;
		
	}
	
	
	/*getters and setters*/
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQtdDepartamentos() {
		return qtdDepartamentos;
	}
	public void setQtdDepartamentos(int qtdDepartamentos) {
		this.qtdDepartamentos = qtdDepartamentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
