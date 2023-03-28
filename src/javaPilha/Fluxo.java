package javaPilha;

public class Fluxo {
	
	public static void main(String[] args) {
		
		System.out.println("ini do main");
		try {
		metodo1();
		} catch(Exception ex) {
		    String msg = ex.getMessage();
		    System.out.println("Exception " + msg);
		    ex.printStackTrace();
		}
		System.out.println("fim do main");
	}
	private static void metodo1() throws MinhaExcecao{
		
		System.out.println("ini do metodo1"); 
			metodo2();
		System.out.println("fim do metodo1");
	}
	
	private static void metodo2() throws MinhaExcecao {
		
		System.out.println("ini do metodo 2");
		
		/*
		ArithmeticException exeption = new ArithmeticException("deu errado");
		throw exeption;
		lançaremos excessão de maneira mais enxuta("menor") em apenas 1 linha*/
		
		throw new MinhaExcecao("deu Muito errado");
		
		//System.out.println("fim do metodo2"); Unreachable code, o throw muda o fluxo de execução, ele vai sair do metodo 2 no ponto em que foi lnaçado, por isso o sysout nunca será exibido	
	}
}
