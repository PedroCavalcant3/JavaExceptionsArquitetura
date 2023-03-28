package javaPilha;

public class FluxoComError {
	
	public static void main(String[] args)  {
		
		System.out.println("ini do main");
		try {
		metodo1();
		} catch(ArithmeticException | NullPointerException ex) {
		    String msg = ex.getMessage();
		    System.out.println("Exception " + msg);
		    ex.printStackTrace();
		}
		System.out.println("fim do main");
	}
	private static void metodo1(){
		
		System.out.println("ini do metodo1");
			metodo2();
		System.out.println("fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("ini do método 2"); 
		metodo2();
		System.out.println("fim do método 2"); 
	}
}
