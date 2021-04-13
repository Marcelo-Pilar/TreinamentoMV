package sorveteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		String tipo = null;
		int opcao;

		do {
			System.out.println("");
			System.out.println("Bem vindo a sorveteria San Gennaro!");
			System.out.println("Escolha uma das opções abaixo: ");
			System.out.println("[1] - Adicionar item ao estoque.");
			System.out.println("[2] - Remover item do estoque.");
			System.out.println("[3] - Listar itens do estoque.");
			System.out.println("[4] - Sair.");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o item a ser adicionado: ");
				tipo = sc.next().toLowerCase();
				list.add(tipo);

				System.out.println("Item adicionado com sucesso!");
				break;

			case 2:
				System.out.println("Digite o item a ser removido: ");
				if (tipo == null) {
					System.out.println("Estoque vazio.");
				} else {
					tipo = sc.next().toLowerCase();
					list.remove(tipo);
					System.out.println("Item removido com sucesso!");
				}
				break;

			case 3:
				System.out.println("Itens no estoque: ");
				if (tipo != null)
					for (String x : list) {
						System.out.println(x);
					}
				else {
					System.out.println("0");
				}

				break;

			case 4:
				System.out.println("Programa encerrado com sucesso!");
				break;

			default:
				System.out.println("Opção inválida, tente novamente!");
			}

		} while (opcao != 0);
		sc.close();
	}
}
