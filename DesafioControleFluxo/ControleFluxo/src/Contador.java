import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.??;
		
		try {
			//chamando o método contendo a lógica de contagem
			(parametroUm > parametroDois)
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
				
		int contagem = parametroDois - parametroUm;
		for (int i = 0; i < contagem; i++){
			contagem = contagem + 1;
			System.out.printf("Imprimindo o numero %d", contagem);
		}
	}
}

