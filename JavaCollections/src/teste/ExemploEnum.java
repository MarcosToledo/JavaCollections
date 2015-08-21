package teste;

public enum ExemploEnum {
	
	SALVAR(1), IMPRIMIR(2), ABRIR(3), VISUALIZAR(4), FECHAR(5);
	
	private final int valor;
	
	private ExemploEnum(int valorOpcao) {
		valor = valorOpcao;
		
	}
	
	public int getValor(){
		return valor;
	}
}
