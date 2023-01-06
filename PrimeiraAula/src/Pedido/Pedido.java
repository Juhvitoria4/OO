package Pedido;

import java.text.SimpleDateFormat;
import java.util.*;

public class Pedido {
	
	private int numero;
	private Date dataPedido;
	private Date dataEntrega;
	private float valorTotal;
	private float valorImposto;
	private float valorLiquido;
	private float aliquota;
	private ArrayList <Produto> produtos;
	private ArrayList <Item> item;
	private Cliente cliente;
	private Imposto imposto;
	
	
	/*Serviços*/
	
	public void calcularValorTotal() {
		// implementar
	}
	
	public void calcularImposto() {
		// implementar
	}
	
	public void calcularValorLíquido(float desconto) {
		// implementar
	}

	public Date getDataPedido() {
		return dataPedido;
	}
	
	
	private Date converteData(String dataRecebida) {
		
		try {
			
			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
			Date dataFormatada = formatador.parse(dataRecebida);
			return dataFormatada;
		
		
		} catch (Exception e) {
			System.out.println("Erro na formatação da data");
		}
		
		return null;

	}
	
	/* getters and setters*/
	public void setDataPedido(String dataRecebida) {
		dataPedido = converteData(dataRecebida);
		
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public float getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(float valorImposto) {
		this.valorImposto = valorImposto;
	}

	public float getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(float valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public float getAliquota() {
		return aliquota;
	}

	public void setAliquota(float aliquota) {
		this.aliquota = aliquota;
	}

	public Imposto getImposto() {
		return imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}
	
	
	
}
