import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parameterOne = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parameterTwo = terminal.nextInt();
		terminal.close();
		
		try {
			//chamando o método contendo a lógica de contagem
			count(parameterOne, parameterTwo);
		
		}catch (InvalidParameterException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(exception.getMessage());
		} finally {
			//imprimir a mensagem: Programa finalizado
			System.out.println("Programa finalizado");
		}
		
	}

	static void count(int parameterOne, int parameterTwo ) throws InvalidParameterException {
		//validar se parameterOne é MAIOR que parameterTwo e lançar a exceção
		if (parameterOne > parameterTwo) {
			throw new InvalidParameterException("O segundo parâmetro deve ser maior que o primeiro");
		} else {
			int counting = parameterTwo - parameterOne;
			//realizar o for para imprimir os números com base na variável contagem
			System.out.println("Contagem abaixo: ");
			for (int index = 0; index < counting; index++) {
				System.out.println(index + 1);
			}
		}
	}
}
