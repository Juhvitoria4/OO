package Projeto1;

public class Main {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		Empresa e1 = new Empresa(1,"Martineli LTDA");
		e1.addDepartamento(new Departamento(1, "RH", 20));
		e1.addDepartamento(new Departamento(2, "Financeiro", 10));
		e1.addDepartamento(new Departamento(3, "Software", 200));
		e1.addDepartamento(new Departamento(4, "Suporte", 30));
		
		System.out.println("Quantidade de departamntos da empresa " + e1.getNome() + " = " + e1.getQtdDepartamentos());
		System.out.println("\nQuantidade funcionários " + " = " + e1.calcularQtdFuncionarios());


	}

}


