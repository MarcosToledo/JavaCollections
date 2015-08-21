package teste;

public class TestaEnum {
	
	public static void escolheOpcao(ExemploEnum opcao){
		if(opcao == ExemploEnum.SALVAR){
			System.out.println("Salvando o arquivo");
		}
		else if(opcao == ExemploEnum.ABRIR){
			System.out.println("Abrindo o arquivo");
		}
	}
	
	public static void comparaEnum(ExemploEnum opcao){
		if(opcao.equals(ExemploEnum.SALVAR)){
			System.out.println("Foi escolhido a opção SALVAR");
		}
		else if (opcao.equals(ExemploEnum.ABRIR)){
			System.out.println("Foi escolhido a opção ABRIR");
		}
		else if(opcao.equals(ExemploEnum.FECHAR)){
			System.out.println("Foi escolhido a opção FECHAR");
		} 
		
		
	}

	public static void main(String[] args) {
		/*MarcarEnum hp = MarcarEnum.HP;
		MarcarEnum Samsung = MarcarEnum.SAMSUNG;
		
		System.out.println("Nome da marca = " + hp.name());
		System.out.println("Nome da marca = " + Samsung.name());
		*/
		
		comparaEnum(ExemploEnum.FECHAR);

	}

}
