package javaPilha;

public class Conexao implements AutoCloseable{
	
	public Conexao() {
		System.out.println("Abrindo Conexão");
		throw new IllegalStateException();
	
	}
	public void leDados() {
		System.out.println("Recebendo Dados");
		throw new IllegalStateException();
	}
	
	@Override
	public void close()  {
		System.out.println("fechando Conexão");
	}

}
