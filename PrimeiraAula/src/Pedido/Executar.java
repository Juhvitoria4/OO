package Pedido;

import java.util.ArrayList;
public class Executar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Pedido p;
		
		p = new Pedido();
		p.setNumero(1);
		p.setDataPedido("26/11/2022");
		System.out.println(p.getNumero() +"\n" + p.getDataPedido());
		
		
		ArrayList<Pedido> pedidos = new ArrayList<>();
		
		pedidos.add(p);
		pedidos.add(p);
		pedidos.add(p);
		
		System.out.println("Quantidade de pedidos = " + pedidos.size());
		
		

	}

}
